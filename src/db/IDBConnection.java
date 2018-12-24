package db;

import java.sql.Connection;
import java.sql.DriverManager;

import static db.DataBase.*;

public interface IDBConnection {

    default Connection connectToDB(){
        Connection conection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conection = DriverManager.getConnection(URL+DB,USER,PASSWORD);

            if (conection != null){
                System.out.println("Se establecion la conexion");
            }else{
                System.out.println("No se establecio la contraseña");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en la conexion");
        }finally {
            return conection;
        }
    }
}
