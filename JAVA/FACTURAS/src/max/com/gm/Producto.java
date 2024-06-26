package max.com.gm;

public class Producto {
    /*Hacemos que idProducto sea de tipo final para que solo pueda ser modificada
    * una vez al inicio de la creacion de una instancias de la clase Producto*/
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int CONTADOR;

    private Producto(){
        this.idProducto = ++Producto.CONTADOR;
    }

    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override //Es recomendable en este caso indicar @Override para indicarselo a el
              //compilador
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
