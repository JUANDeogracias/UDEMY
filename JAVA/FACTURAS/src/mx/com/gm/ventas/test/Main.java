package mx.com.gm.ventas.test; // Corregir el nombre del paquete

import max.com.gm.*; // Corregir el nombre del paquete e importar la clase Producto adecuada

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);

        Orden orden1 = new Orden();

        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        orden1.mostrarOrden();

    }
}
