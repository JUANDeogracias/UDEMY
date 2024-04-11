package max.com.gm;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        /*Es importantisimo inicializar el arreglo de el tipo producto
        * ya que de el siguiente modo vamos a poder definir un máximo a el
        * array productos*/
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    /*funcion que va a recibir como parametro un producto y le va a agregar a el array
    * creado ese mismo producto*/
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo de productos: "+ Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i=0; i<contadorProductos;i++){
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("idOrden = " + idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("total de la orden = " + totalOrden);
        System.out.println("productos de la orden = ");
        for(int i = 0; i<this.contadorProductos;i++){
            System.out.println(this.productos[i]);
        }
    }
}
