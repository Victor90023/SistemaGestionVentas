/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conectar;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Usuario
 */
public class Conectar {

public static final String URL = "jdbc:mysql://192.168.0.141:3306/VentasAV";
public static final String USER = "vhidalgo";
public static final String CLAVE = "4toC.2024";
public Connection getConexion(){
    Connection con = null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = (Connection) DriverManager.getConnection(URL,USER,CLAVE);
    } catch(Exception e){
        System.out.println("Error: "+e.getMessage());
    }
    return con;
}
}
