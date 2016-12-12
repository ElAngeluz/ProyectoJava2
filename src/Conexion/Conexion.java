package Conexion;

/*import entidades.Cliente;
import entidades.Usuario;*/
import java.sql.*;
import java.util.ArrayList;

public class Conexion {
    
       private Connection con;
       private static final String DRIVER = "com.mysql.jdbc.Driver";
       private static final String DBMS = "mysql";
       private static final String HOST = "br-cdbr-azure-south-b.cloudapp.net";
       private static final String PORT = "3306";
       private static final String DATABASE = "proyecto_inventario";
       private static final String USER = "bf4e879eeb4fc7";
       private static final String PASSWORD = "d11151f4";

    void Conexion(){}
    
    /*METODO CONECTAR*/
   
    public void conectar ()throws Exception{
        try {
            Class.forName(DRIVER);
        }catch(ClassNotFoundException ce){
        }
        
            try{
                this.con = DriverManager.getConnection("jdbc:" + DBMS + "://" + HOST + ":" + PORT + "/" + DATABASE, USER, PASSWORD);                
            }catch(SQLException exception){
                System.out.println("ERROR: NO SE PUDO CONECTAR CON LA BASE DE DATOS: "+exception);
                return ;
            } 
        System.out.println("CONEXION EXITOSA CON LA BASE DE DATOS");
    }
    
    public boolean desconectar()
    {
        try
        {
            this.con.close();
            return(true);
        }
        catch(Exception e)
        {
            return(false);
        }    
    }
}