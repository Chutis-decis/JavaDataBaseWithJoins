package com.mycompany.platillos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RestauranteDAO {
    
    
    
    public static void Mostrar () {
        Conexion db_conect = new Conexion();
        PreparedStatement p =null; //Preparando la declaracion 
        ResultSet rs = null; //Conjunto de resultados 
        
        try(Connection con = db_conect.conexion()){ //conectandose a la base de datos 
            
            String querry = "SELECT * FROM Platillo";
            p = con.prepareStatement(querry);
            rs=p.executeQuery();
            
            while(rs.next()){//Mientras el objeto rs tenga datos
                System.out.println("ID: " +rs.getInt("id_platillo"));
                System.out.println("Platillo " +rs.getString("platillo"));
                System.out.println("Soda: " +rs.getString("soda"));
                System.out.println("Postres: " + rs.getString("postre"));
            }
        }catch(Exception e){
            System.out.println("No se puede mostrar a el Menu del Platillo\n" + e);
        }
    }
    public static void Borrar(int id_platillo){
        Conexion conexion = new Conexion ();
        
        try (Connection con = conexion.conexion()){
            
            PreparedStatement p = null;
            
            try{
                String querry = "DELETE FROM platillo WHERE id_platillo=?";
                p=con.prepareStatement(querry);
                p.setInt(1,id_platillo);
                p.executeUpdate();
                System.out.println("El platillo ha sido eliminado del menú");
            }catch(SQLException e){
                System.out.println(e);
                System.out.println("No se pudo eliminar el platillo ");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void Editar (Platillos platillo ){
        Conexion conexion = new Conexion ();
        
        try (Connection con = conexion.conexion()){
            PreparedStatement p = null;
            try{
                String querry ="UPDATE platillo SET platillo =?, soda=?, postre=? WHERE id_platillo =?";
                p = con.prepareStatement(querry);
                p.setString(1, platillo.getPlatillo());
                p.setString(2, platillo.getSoda());
                p.setString(3, platillo.getPostre());
                p.setInt(4, platillo.getId());
                
                p.executeUpdate();
                
                System.out.println("El platillo fue editado con exito!!!");
                
            }catch(SQLException e){
                
                System.out.println("No se pudo actualizar el Platillo" + e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void Insertar(Platillos platillo ){
        Conexion conexion = new Conexion();
        
        try(Connection con = conexion.conexion()){
            PreparedStatement p = null;
            
            try{
                String querry ="INSERT INTO platillo (platillo, soda, postre) VALUES  (?,?,?)";
                
                p=con.prepareStatement(querry);
                
                p.setString(1, platillo.getPlatillo());
                p.setString(2, platillo.getSoda());
                p.setString(3, platillo.getPostre());
                
                p.executeUpdate();
                
                System.out.println("Platillo creado");
            }catch(SQLException e){
                System.out.println("Platillo no creado \n" + e);
                
            }
        }catch(SQLException e ){
            System.out.println(e);
        }
    }
    public static void MostrarJoin(){
        Conexion conexion = new Conexion();
        
        PreparedStatement p = null; 
        ResultSet rs = null; 
        
        try (Connection con = conexion.conexion()){
            String querry ="SELECT * FROM Persona LEFT JOIN Platillo on Persona.id = Platillo.id_platillo";
            p=con.prepareStatement(querry);
            rs=p.executeQuery();
            
            while (rs.next()){
                System.out.println("Nombre: " +rs.getString("nombre") + " Platillo Completo: " + rs.getString("platillo") 
                + " ," + rs.getString("soda") + " y "  + rs.getString("postre"));
                System.out.println("");
            }
        }catch(SQLException e){
            System.out.println("No se pudo mostrar Usuario con el Platillo que quiere");
            System.out.println(e);
        }
    }
}
