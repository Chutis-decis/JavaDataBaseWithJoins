
package com.mycompany.platillos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con = null;
   public Connection conexion (){ 
    try{
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario","root","1q2w3e4r5t6y7u8i9ol");
        
    }catch(Exception e){
        System.out.println(e);
    }
        return con;
    }
}
