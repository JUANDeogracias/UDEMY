//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 1999, TipoEscritura.CLASICA);
//      System.out.println("empleado = " + empleado);

        //Pongamos en practica el polimorfismo con la siguiente linea
        //Al tener guardada la direccion de memoria de un objeto hijo el cual esta siendo
        //apuntado por la clase padre empleado podemos acceder a los valores de la clase hija
        System.out.println(empleado.obtenerDetalles());

        //DOWNCASTING
        //Mediante lo siguiente lo que hacemos es convertir a un tipo de la clase padre a un tipo
        //de la clase hija
//      ((Escritor)empleado).getTipoEscritura();

        //UPCASTING
        //A continuacion hacemos lo mismo que lo anterior pero para convertir un tipo hijo en un tipo
        //padre
        Escritor escritor = (Escritor)empleado;
    }

}