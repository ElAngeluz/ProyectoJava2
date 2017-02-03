package Conexion;

import java.sql.*;

public class Conexion {
       private static final String DRIVER = "com.mysql.jdbc.Driver";
       private static final String DBMS = "mysql";
       private static final String HOST = "br-cdbr-azure-south-b.cloudapp.net";
       //private static final String HOST = "127.0.0.1";
       private static final String PORT = "3306";
       private static final String DATABASE = "proyecto_inventario";
       private static final String USER = "bf4e879eeb4fc7";
       private static final String PASSWORD = "d11151f4";
       //private static final String USER = "root";
       //private static final String PASSWORD = "";

    void Conexion(){}
    
    /*METODO CONECTAR*/
   
    public static Connection conectar ()throws Exception{
        try {
            Class.forName(DRIVER);
        }catch(ClassNotFoundException ce){
            System.out.println("error en el driver: " +ce);
        }  
        
        try{
            System.out.println("Conectando a la base de datos");
            return DriverManager.getConnection("jdbc:" + DBMS + "://" + HOST + ":" + PORT + "/" + DATABASE, USER, PASSWORD);                
        }catch(SQLException exception){
            System.out.println("ERROR: NO SE PUDO CONECTAR CON LA BASE DE DATOS: "+exception);
            return null;
        }         
    }
}