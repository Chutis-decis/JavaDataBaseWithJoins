package UI;

import com.mycompany.platillos.Conexion;
import com.mycompany.platillos.restauranteService;
import java.util.Scanner;

public class UIMenu {
    Conexion conexion = new Conexion();
    
    Scanner sc = new Scanner (System.in);
    public void Menu(){
    int opcion = 0;
    
     do {
            System.out.println("*************************************************************");
            System.out.println("    Aplicacion de mensajes");
            System.out.println("1.Mostrar Platillos ");
            System.out.println("2.Eliminar Platillo");
            System.out.println("3.Editar platillo");
            System.out.println("4.Insertar Platillo ");
            System.out.println("5.Mostrar los Usuarios con los platillos ");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    restauranteService.MostrarService();
                    break;
                case 2: 
                    restauranteService.BorrarService();
                    break;
                case 3: 
                    restauranteService.editarService();
                    break;
                case 4:
                    restauranteService.insertarService();
                    break;
                case 5: 
                    restauranteService.mostrarJoinService();
                    break;
                default:
                    break;
            }
        }while(opcion != 6);
    }
}
