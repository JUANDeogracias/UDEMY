public class Empleado extends Persona{
    /*empleado va a heredar de Persona por lo tanto al imprimir Empleado se va a imprimir
    lo de persona*/
    /*Como sabemos que no vamos a tener mas subclases lo mas recomendable es utilizar private
    * en vez de protected*/
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    private Empleado() {
        this.idEmpleado = ++contadorEmpleado;
    }

    public Empleado(String nombre){

    }
    public Empleado(String nombre, double sueldo){
        /*Mediante super llamamos y asignamos el nombre que recibimos de
        este constructor a el constructor de la clase padre */
        //super(nombre);
        /*A continuacion vamos a llamar internamente a un constructor el cual esta
        * vacio y es el que se situa justo arriba que es this()*/
        this();
        /*Para asignar el nombre de la clase padre hacemos lo siguiente*/
        this.nombre = nombre;
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        /*Al ser hijo de persona, podemos acceder a los metodos de persona
        como vamos a hacer a continuacion*/
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
