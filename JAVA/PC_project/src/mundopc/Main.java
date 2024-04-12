package mundopc;
import com.gm.mundopc.*;


public class Main {
    public static void main(String[] args) {
        /*Definicion de elementos simples:*/
        Monitor monitor = new Monitor("hp", 13);
        Teclado teclado = new Teclado("bluetooh", "hp");
        Raton raton = new Raton("bluetooh", "hp");

        Monitor monitorGamer = new Monitor("hp", 34);
        Teclado tecladoGamer = new Teclado("bluetooh", "hp Gamer");
        Raton ratonGamer = new Raton("bluetooh", "hp Gamer");

        /*Definicion de elementos padres*/
        Computadora computadora = new Computadora("computadora", monitor, raton, teclado);
        Computadora computadoraGamer = new Computadora("computadora Gamer", monitorGamer, ratonGamer,
                tecladoGamer);

        Orden orden = new Orden();
        orden.agregarComputadora(computadora);
        orden.agregarComputadora(computadoraGamer);

        orden.mostrarOrden();


    }
}