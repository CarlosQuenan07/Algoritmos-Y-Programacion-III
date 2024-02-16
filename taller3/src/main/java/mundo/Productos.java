package mundo;

/**
 * @author
 * Valentina Alvarez 
 * Carlos Quenan
 */
public class Productos {
    //atributos
    private String nombreProducto;
    private double precio;
    private int cantidad;
    private int idProducto;
    
    //constructor vacio

    public Productos() {
    }
    //constructor lleno

    public Productos(String nombreProducto, double precio, int cantidad, int idProducto) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
    }

    
    //getters

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }
}
