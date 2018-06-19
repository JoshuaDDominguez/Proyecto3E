/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joshua
 */
public class Estructura {

    public void crearTablas() throws ClassNotFoundException {
        Class.forName(
                "org.sqlite.JDBC");

        Connection connection = null;

        try {
            //Crear la conexion con la base de datos
            connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement statement = connection.createStatement();

            //Tabla AMERICANA
            statement.executeUpdate("drop table if exists americano");
            statement.executeUpdate("create table americano (precio float, name string)");
            statement.executeUpdate("insert into americano values(" + "2.9" + ", 'Hamburguesa')");
            statement.executeUpdate("insert into americano values(" + "3.5" + ", 'Bocata')");
            statement.executeUpdate("insert into americano values(" + "3.0" + ", 'Sandwich')");
            statement.executeUpdate("insert into americano values(" + "5.6" + ", 'Menu')");
            statement.executeUpdate("insert into americano values(" + "4.9" + ", 'Ensalada')");
            statement.executeUpdate("insert into americano values(" + "1.9" + ", 'Patatas')");
            statement.executeUpdate("insert into americano values(" + "2.5" + ", 'Perrito')");
            statement.executeUpdate("insert into americano values(" + "1.6" + ", 'Nestea')");
            statement.executeUpdate("insert into americano values(" + "1.0" + ", 'Agua')");
            statement.executeUpdate("insert into americano values(" + "1.5" + ", 'Kas')");

//          //Tabla CHINA
            statement.executeUpdate("drop table if exists chino");
            statement.executeUpdate("create table chino (precio float, name string)");
            statement.executeUpdate("insert into chino values(" + "5.1" + ", 'Pollo')");
            statement.executeUpdate("insert into chino values(" + "8.3" + ", 'Pato')");
            statement.executeUpdate("insert into chino values(" + "5.0" + ", 'Fideos')");
            statement.executeUpdate("insert into chino values(" + "5.6" + ", 'Ternera')");
            statement.executeUpdate("insert into chino values(" + "4.8" + ", 'Arroz')");
            statement.executeUpdate("insert into chino values(" + "2.8" + ", 'Sopa')");
            statement.executeUpdate("insert into chino values(" + "2.7" + ", 'Ensalada')");
            statement.executeUpdate("insert into chino values(" + "1.3" + ", 'Rollitos')");
            statement.executeUpdate("insert into chino values(" + "1.2" + ", 'Pan')");
            statement.executeUpdate("insert into chino values(" + "5.0" + ", 'Bambu')");
            statement.executeUpdate("insert into chino values(" + "4.9" + ", 'Cerdo')");
            statement.executeUpdate("insert into chino values(" + "5.5" + ", 'Pescado')");
            statement.executeUpdate("insert into chino values(" + "3.2" + ", 'Mousse')");
            statement.executeUpdate("insert into chino values(" + "1.8" + ", 'Nestea')");
            statement.executeUpdate("insert into chino values(" + "1.7" + ", 'Cerveza')");
            statement.executeUpdate("insert into chino values(" + "6.5" + ", 'Vino')");

//          //Tabla ESPAÑOLA
            statement.executeUpdate("drop table if exists espanola");
            statement.executeUpdate("create table espanola (precio float, name string)");
            statement.executeUpdate("insert into espanola values(" + "9.9" + ", 'Tortilla')");
            statement.executeUpdate("insert into espanola values(" + "9.9" + ", 'Empanada')");
            statement.executeUpdate("insert into espanola values(" + "5.1" + ", 'Calamares')");
            statement.executeUpdate("insert into espanola values(" + "5.5" + ", 'Pechuguita')");
            statement.executeUpdate("insert into espanola values(" + "3.7" + ", 'Tarta')");
            statement.executeUpdate("insert into espanola values(" + "2.3" + ", 'Rollitos')");
            statement.executeUpdate("insert into espanola values(" + "5.4" + ", 'Croquetas')");
            statement.executeUpdate("insert into espanola values(" + "2.5" + ", 'Arroz')");
            statement.executeUpdate("insert into espanola values(" + "5.4" + ", 'Alitas')");
            statement.executeUpdate("insert into espanola values(" + "5.9" + ", 'Mejillones')");
            statement.executeUpdate("insert into espanola values(" + "3.9" + ", 'Ensaladilla')");
            statement.executeUpdate("insert into espanola values(" + "2.5" + ", 'Patatas')");
            statement.executeUpdate("insert into espanola values(" + "3.6" + ", 'Ensalada')");
            statement.executeUpdate("insert into espanola values(" + "4.1" + ", 'Lentejas')");
            statement.executeUpdate("insert into espanola values(" + "4.1" + ", 'Macarrones')");
            statement.executeUpdate("insert into espanola values(" + "5.4" + ", 'Espagueti')");
            statement.executeUpdate("insert into espanola values(" + "5.4" + ", 'Albondigas')");
            statement.executeUpdate("insert into espanola values(" + "5.7" + ", 'Jamon')");
            statement.executeUpdate("insert into espanola values(" + "5.9" + ", 'Milanesa')");
            statement.executeUpdate("insert into espanola values(" + "6.7" + ", 'Merluza')");
            statement.executeUpdate("insert into espanola values(" + "2.7" + ", 'Bocadillo')");
            statement.executeUpdate("insert into espanola values(" + "9.9" + ", 'Empanada')");
            statement.executeUpdate("insert into espanola values(" + "1.8" + ", 'Aquarius')");
            statement.executeUpdate("insert into espanola values(" + "1.7" + ", 'Kas')");
            statement.executeUpdate("insert into espanola values(" + "1.8" + ", 'Nestea')");
            statement.executeUpdate("insert into espanola values(" + "1.0" + ", 'Agua')");
            statement.executeUpdate("insert into espanola values(" + "1.8" + ", 'Cerveza')");
            statement.executeUpdate("insert into espanola values(" + "1.2" + ", 'Sidra')");

            //Tabla PIZZA
            statement.executeUpdate("drop table if exists piza");
            statement.executeUpdate("create table piza (precio float, name string)");
            statement.executeUpdate("insert into piza values(" + "11.0" + ", 'Minipizza')");
            statement.executeUpdate("insert into piza values(" + "8.0" + ", 'Pizza')");
            statement.executeUpdate("insert into piza values(" + "15.0" + ", 'Pizzote')");
            statement.executeUpdate("insert into piza values(" + "3.0" + ", 'Hamgurguesa')");
            statement.executeUpdate("insert into piza values(" + "4.0" + ", 'Pepito')");
            statement.executeUpdate("insert into piza values(" + "2.0" + ", 'Perrito')");
            statement.executeUpdate("insert into piza values(" + "2.7" + ", 'Bocadillo')");
            statement.executeUpdate("insert into piza values(" + "2.8" + ", 'Sandwich')");
            statement.executeUpdate("insert into piza values(" + "2.0" + ", 'Patatas')");
            statement.executeUpdate("insert into piza values(" + "3.5" + ", 'Alitas')");
            statement.executeUpdate("insert into piza values(" + "6.5" + ", 'Nuggets')");
            statement.executeUpdate("insert into piza values(" + "4.5" + ", 'Ensalada')");
            statement.executeUpdate("insert into piza values(" + "1.9" + ", 'Kas')");
            statement.executeUpdate("insert into piza values(" + "1.9" + ", 'Aquarius')");
            statement.executeUpdate("insert into piza values(" + "1.9" + ", 'Nestea')");
            statement.executeUpdate("insert into piza values(" + "1.9" + ", 'Trina')");
            statement.executeUpdate("insert into piza values(" + "1.1" + ", 'Agua')");
            statement.executeUpdate("insert into piza values(" + "8.0" + ", 'Monster')");
            statement.executeUpdate("insert into piza values(" + "2.0" + ", 'Cerveza')");

            //Tabla KEBAB
            statement.executeUpdate("drop table if exists kebab");
            statement.executeUpdate("create table kebab (precio float, name string)");
            statement.executeUpdate("insert into kebab values(" + "4.5" + ", 'Kebab')");
            statement.executeUpdate("insert into kebab values(" + "5.5" + ", 'Durum')");
            statement.executeUpdate("insert into kebab values(" + "6.5" + ", 'Lahmacun')");
            statement.executeUpdate("insert into kebab values(" + "6.0" + ", 'Falafel')");
            statement.executeUpdate("insert into kebab values(" + "2.5" + ", 'Arroz')");
            statement.executeUpdate("insert into kebab values(" + "3.0" + ", 'Snacks')");
            statement.executeUpdate("insert into kebab values(" + "3.5" + ", 'Nuggets')");
            statement.executeUpdate("insert into kebab values(" + "1.6" + ", '7UP')");
            statement.executeUpdate("insert into kebab values(" + "1.0" + ", 'Agua')");
            statement.executeUpdate("insert into kebab values(" + "2.5" + ", 'Cerveza')");

            //Tabla ITALIANO
            statement.executeUpdate("drop table if exists italiano");
            statement.executeUpdate("create table italiano (precio float, name string)");
            statement.executeUpdate("insert into italiano values(" + "8.3" + ", 'Bolognese')");
            statement.executeUpdate("insert into italiano values(" + "8.3" + ", 'Carbonara')");
            statement.executeUpdate("insert into italiano values(" + "8.3" + ", 'Funghi')");
            statement.executeUpdate("insert into italiano values(" + "9.3" + ", 'Lasagne')");
            statement.executeUpdate("insert into italiano values(" + "9.0" + ", 'Gambaretti')");
            statement.executeUpdate("insert into italiano values(" + "5.1" + ", 'Ciabatta')");
            statement.executeUpdate("insert into italiano values(" + "9.3" + ", 'Macarroni')");
            statement.executeUpdate("insert into italiano values(" + "9.3" + ", 'Tortellini')");
            statement.executeUpdate("insert into italiano values(" + "9.3" + ", 'Canneloni')");
            statement.executeUpdate("insert into italiano values(" + "3.1" + ", 'Bollitos')");
            statement.executeUpdate("insert into italiano values(" + "3.1" + ", 'Pan')");
            statement.executeUpdate("insert into italiano values(" + "3.4" + ", 'Nuggets')");
            statement.executeUpdate("insert into italiano values(" + "4.1" + ", 'Bunuelos')");
            statement.executeUpdate("insert into italiano values(" + "7.4" + ", 'Insalata')");
            statement.executeUpdate("insert into italiano values(" + "3.1" + ", 'Tiramisu')");
            statement.executeUpdate("insert into italiano values(" + "3.1" + ", 'Tarta')");
            statement.executeUpdate("insert into italiano values(" + "1.5" + ", 'Helados')");
            statement.executeUpdate("insert into italiano values(" + "3.5" + ", 'Crepe')");
            statement.executeUpdate("insert into italiano values(" + "1.7" + ", 'Aquarius')");
            statement.executeUpdate("insert into italiano values(" + "1.7" + ", 'Kas')");
            statement.executeUpdate("insert into italiano values(" + "1.7" + ", 'Trina')");
            statement.executeUpdate("insert into italiano values(" + "1.7" + ", 'Nestea')");
            statement.executeUpdate("insert into italiano values(" + "1.2" + ", 'Agua')");
            statement.executeUpdate("insert into italiano values(" + "1.7" + ", 'Cerveza')");

        } catch (SQLException ex) {
            Logger.getLogger(Estructura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
