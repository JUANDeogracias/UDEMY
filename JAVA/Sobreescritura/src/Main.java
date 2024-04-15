//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Gerente gerente = new Gerente("Juan", 1900, "JUAN");
//        System.out.println(gerente.obtenerDetalles());
        /*POLIMORFISMO*/
        Empleado empleado = new Empleado("Juan", 1900);
        //System.out.println("empleado.obtenerDetalles() = " + empleado.obtenerDetalles());
        imprimir(empleado);
        determinarTipo(empleado);

        Gerente gerente = new Gerente("Karla", 1700, "CONTABILIDAD");
        //System.out.println("Gerente = " + gerente.obtenerDetalles());
        /*A la hora de pasar gerente a la funcion imprimir. La clase Empleado de la funcion
        * imprimir va a recibir la direccion de memoria de el objeto hijo gerente es decir
        * que la clase padre Empleado puede apuntar a objetos hijos como ocurre en este caso.
        *
        * Pasos que realizaria en este proceso: 1.enviar la direccion de memoria de el objeto hijo
        * gerente a la funcion imprimir, 2. ya en la funcion imprimir la clase empleado (clase padre)
        * va a apuntar a la direccion de memoria de el objeto hijo y va a ejecutar la funcion de
        * el objeto hijo*/
        imprimir(gerente);

        //Tambien podemos hacer esto
        empleado = new Gerente("manolo", 1600, "CONTABILIDAD");
        imprimir(empleado);
        determinarTipo(empleado);
    }
    public static void imprimir(Empleado empleado){
        System.out.println("Empleado.obtenerDetalles() = " + empleado.obtenerDetalles());
    }
    public static void determinarTipo(Empleado empleado){
        /*En este caso lo que estamos haciendo en el if es preguntar si empleado
        * esta apuntando a un objeto del tipo Gerente*/
        if (empleado instanceof Gerente){
            System.out.println("Empleado es del tipo Gerente");
            /*Mediante lo siguiente lo que estamos haciendo es crear un objeto local (solo sirve
            para esta funcion) de el tipo Gerente que va a recibir la direccion de memoria de
            el objeto que queremos y que han pasado a la funcion de modo que ese nuevo objeto
            local va a tener asignada la direccion de memoria de el objeto que queremos y que han
            pasado desde el main a la funcion*/
            Gerente gerente = (Gerente)empleado;

            System.out.println("gerente.getDepartamento() = " + gerente.getDepartamento());
        }else{
            System.out.println("Empleado esta apuntado a un objeto de el mismo tipo");
        }
    }
}