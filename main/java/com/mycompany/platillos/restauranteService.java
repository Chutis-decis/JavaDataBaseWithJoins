package com.mycompany.platillos;

import java.util.Scanner;

public class restauranteService {
    
    public static void MostrarService(){
        RestauranteDAO.Mostrar();
    }
    public static void BorrarService(){
        Scanner sc = new Scanner (System.in); 
        
        System.out.println("Indica el ID del Platillo que quieras eliminar");
        int id = sc.nextInt();
        
        RestauranteDAO.Borrar(id);
    }
    public static void editarService(){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escribe el platillo por el que lo quieres modificar");
        String plati = sc.nextLine();
        
        System.out.println("Escribe la bebida que quieres modificar");
        String sod = sc.nextLine();
        
        System.out.println("Escribe el postre que quieres modificar");
        String postr = sc.nextLine();
        
        System.out.println("Indica el ID del platillo completo que quieres modificar");
        int id = sc.nextInt();
        
        
        Platillos platillosModificado = new Platillos();
        platillosModificado.setId(id);
        platillosModificado.setPlatillo(plati);
        platillosModificado.setSoda(sod);
        platillosModificado.setPostre(postr);
        
        RestauranteDAO.Editar(platillosModificado);
    }
    public static void insertarService(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe el platillo que quieres agregar");
        String plat = sc.nextLine();
        System.out.println("Escribe el refresco que quieras agregar");
        String refresco = sc.nextLine();
        System.out.println("Escribe el postre que quieres agregar ");
        String postr= sc.nextLine();
        
        Platillos platilloAgregado = new Platillos();
        
        
        platilloAgregado.setPlatillo(plat);
        platilloAgregado.setSoda(refresco);
        platilloAgregado.setPostre(postr);
        
        RestauranteDAO.Insertar(platilloAgregado);
    }
    public static void mostrarJoinService(){
        RestauranteDAO.MostrarJoin();
    }
}
