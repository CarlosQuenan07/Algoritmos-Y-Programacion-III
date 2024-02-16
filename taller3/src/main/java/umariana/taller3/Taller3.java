package umariana.taller3;

import java.util.ArrayList;
import java.util.Scanner;
import mundo.Productos;
import java.util.Iterator;

/**
 * @author
 * Valentina Alvarez 
 * Carlos Quenan
 */
public class Taller3 {
    private ArrayList<Productos>misProductos;
    private Scanner lector;
    
    public Taller3 (){
        misProductos = new ArrayList<>();
        lector = new Scanner (System.in);
    }
    public void mostrarMenu(){
        boolean activo=true;
        do{
            System.out.println("_____MENU_DE_OPCIONES_____\n"
            +"1.Agregar un producto\n"
            +"2.Mostrar inventario\n"
            +"3.Eliminar un producto\n"
            +"4.Terminar programa\n");

            int opcion=lector.nextInt();
            switch(opcion){
              case 1:
                añadirProducto();
              break;

              case 2: 
                listaProductos();
              break;

              case 3:
                eliminarProducto();
              break;

              case 4:
                activo=false;
                System.out.println("Programa terminado");
              break;

              default:
                System.out.println("Opcion no valida, intentalo nuevamente");        
            }
        }while(activo);
    }
    private void añadirProducto() {
        lector.nextLine();
        System.out.println("Ingrese el nombre del producto: ");
        String nombreProducto = lector.nextLine();
        System.out.println("Ingrese el Id del producto: ");
        int idProducto =lector.nextInt();   
        System.out.println("Ingrese el precio del producto: ");
        double precio =lector.nextDouble();
        System.out.println("Ingrese la cantidad del producto: ");
        int cantidad = lector.nextInt();
        System.out.println("===========================================");

        Productos nuevoProducto = new Productos(nombreProducto, precio, cantidad, idProducto);
        misProductos.add(nuevoProducto);
        System.out.println("El producto fue agregado");
    }

    private void listaProductos() {
        if(misProductos.isEmpty()){
            System.out.println("No hay productos registrados");
        } else{
            System.out.println("==========PRODUCTOS==========");
            for(int i=0;i<misProductos.size(); i++){
                for(int j=i+1;j<misProductos.size();j++){
                    Productos producto1 = misProductos.get(i);
                    Productos producto2 = misProductos.get(j);
                    if(producto1.getCantidad()>producto2.getCantidad()){
                        misProductos.set(i, producto2);
                        misProductos.set(j, producto1);
                    }
                }
            }
            for(Productos producto: misProductos){
                System.out.println("Id:" + producto.getIdProducto());
                System.out.println("Nombre: " + producto.getNombreProducto());
                System.out.println("cantidad :" + producto.getCantidad());
                System.out.println("precio:" + producto.getPrecio());
                System.out.println("===============================");
            }
        }
    }

    public void eliminarProducto() {
        System.out.println("digite el id del producto a eliminar");
        int id = lector.nextInt();
        Iterator<Productos> it = misProductos.iterator();
        while (it.hasNext()){
            Productos p=it.next();
            if (p.getIdProducto()==id)
                it.remove();
        }
        
    }
    
    public static void main(String[]args){
        Taller3 organizador =new Taller3();
        organizador.mostrarMenu();
    }
}
