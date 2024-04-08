public class Empleado extends Persona{
    /*empleado va a heredar de Persona por lo tanto al imprimir Empleado se va a imprimir
    lo de persona*/
    /*Como sabemos que no vamos a tener mas subclases lo mas recomendable es utilizar private
    * en vez de protected*/
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(){
        Empleado.contadorEmpleado++;
        this.idEmpleado = Empleado.contadorEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                '}';
    }
}
