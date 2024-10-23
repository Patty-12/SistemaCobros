/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacobros;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tenshi
 */
public class conexion {
    Connection con;
    public conexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba01","root","");//cambiar el nombre de la base de datos eso va despues del 3306

        } catch (Exception e) {
            System.err.println("Error:"+e);
        }
    }

    public Connection getConnection(){
        return con;
    }
}
