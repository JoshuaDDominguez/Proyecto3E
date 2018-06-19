/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo
 */
public class ProyectoProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("org.sqlite.JDBC");

        Connection connection = null;
        try {
            //Crear la conexion con la base de datos
            connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement statement = connection.createStatement();

            Float[] prec = new Float[20];
            Direccion dir = new Direccion();
            Estructura estr = new Estructura();

            //Descomentar en el caso de querer reiniciar las tablas
            //estr.crearTablas();
            String calle = dir.selCalle();
            String local = dir.selRest(calle);

            // Muestra la carta segun el local elegido
            switch (local) {
                case "Americano":
                    ResultSet rs = statement.executeQuery("select * from americano");
                    for (int i = 0; rs.next(); i++) {

                        System.out.print("Nº" + rs.getRow());
                        System.out.print(" " + rs.getString("name"));
                        System.out.println(" => " + rs.getFloat("precio") + "€");
                        prec[i] = rs.getFloat("precio");

                    }
                    break;

                case "Chino":
                    ResultSet rs1 = statement.executeQuery("select * from chino");
                    for (int i = 0; rs1.next(); i++) {

                        System.out.print("Nº" + rs1.getRow());
                        System.out.print(" " + rs1.getString("name"));
                        System.out.println(" => " + rs1.getFloat("precio") + "€");
                        prec[i] = rs1.getFloat("precio");

                    }
                    break;

                case "Espanol":
                    ResultSet rs2 = statement.executeQuery("select * from espanola");
                    for (int i = 0; rs2.next(); i++) {

                        System.out.print("Nº" + rs2.getRow());
                        System.out.print(" " + rs2.getString("name"));
                        System.out.println(" => " + rs2.getFloat("precio") + "€");
                        prec[i] = rs2.getFloat("precio");

                    }
                    break;

                case "Italiano":
                    ResultSet rs5 = statement.executeQuery("select * from italiano");
                    for (int i = 0; rs5.next(); i++) {

                        System.out.print("Nº" + rs5.getRow());
                        System.out.print(" " + rs5.getString("name"));
                        System.out.println(" => " + rs5.getFloat("precio") + "€");
                        prec[i] = rs5.getFloat("precio");

                    }

                    break;

                case "Kebab":
                    ResultSet rs4 = statement.executeQuery("select * from kebab");
                    for (int i = 0; rs4.next(); i++) {

                        System.out.print("Nº" + rs4.getRow());
                        System.out.print(" " + rs4.getString("name"));
                        System.out.println(" => " + rs4.getFloat("precio") + "€");
                        prec[i] = rs4.getFloat("precio");

                    }
                    break;
                case "Pizzeria":
                    ResultSet rs3 = statement.executeQuery("select * from piza");
                    for (int i = 0; rs3.next(); i++) {

                        System.out.print("Nº" + rs3.getRow());
                        System.out.print(" " + rs3.getString("name"));
                        System.out.println(" => " + rs3.getFloat("precio") + "€");
                        prec[i] = rs3.getFloat("precio");

                    }
                    break;
            }

            // Pedimos el codigo del producto y se hace la suma del precio de los productos seleccionados
            Integer seleccion = 0;
            Float precioFinal = (float) 0;

            do {
                seleccion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona Nº de producto"));
                if (seleccion > 0) {
                    precioFinal = precioFinal + prec[seleccion - 1];
                }

            } while (seleccion != 0);

            JOptionPane.showMessageDialog(null, precioFinal + " €");

        } catch (SQLException e) {
            // Si salta el error de "out of memory", 
            // Seguramente significa que no se encuentra la base de datos
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // Fallo de cierre de conexion.
                System.err.println(e);
            }
        }

    }

}
