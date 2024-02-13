/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umariana.taller1;

import java.util.ArrayList;
import java.util.Scanner;
import mundo.Tarea;

/**
 *
 * @author Carlos Quenan
 */
public class Taller1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        ArrayList<Tarea> misTareas=new ArrayList <> ();
        boolean activo=true;
        do{
            System.out.println("____menu_de_opciones____\n"
            +"1. Agregar Tarea\n"
            + "2. Mostrar Tareas\n"
            + "3. Terminar Programa");
            
            int opcion = lector.nextInt();
            switch (opcion){
                
            //opcion 1
            case 1 : 
                System.out.println("Ingrese el id de la tarea");
                int id = lector.nextInt(); lector.nextLine();
                System.out.println("Ingrese ingrese la descripcion de la tarea");
                String descripcion=lector.nextLine();
                System.out.println("Ingrese la prioridad de la tarea");
                int prioridad=lector.nextInt();
            //creacion de objeto y llenar la informacion 
            Tarea nuevaTarea = new Tarea (id, descripcion, prioridad);
            //almacenacion el objeto en una conetadora
            misTareas.add(nuevaTarea);
            System.out.println("La tarea fue agregada");
            break;
            
            //opcion 2
            case 2 : 
                System.out.println("____Tareas_registridas____");
                // for que hace un recorrido desde 5 hasta 1 con secuencia de -1
                // para luego organizar las tareas
                for (int i = 5;i >=1 ; i--){
                    //for que hace un recorrido de todas las tareas (objeto Tarea)
                    //que estan almacenadas en la contenedora (misTareas) 
                    for (Tarea tarea : misTareas){
                        if(tarea.getPrioridad() ==i){               
                        System.out.println("descripcion: " + tarea.getDescripcion()); 
                        System.out.println("id: "+ tarea.getIdTarea());
                        System.out.println("prioridad: " + tarea.getPrioridad());
                        System.out.println("______SIGUIENTE_TAREA______");
                        }
                    }  
                }
            break;
            
            //opcion 3
            case 3 : System.out.println("programa cerrado, hasta luego");
            default: System.out.println("opcion no valida");
            } 
            
         
        }while (activo);
    }
}
