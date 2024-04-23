//USO DE LA CLASE EXCEPCION Y RUNTIMEEXCEPCION
//Runtime se utiliza mucho mas a dia de hoy y no necesita de throws
public class OperacionExcepcion extends RuntimeException{
    //Para poder trabajar con nuestros propios tipos de excepcion necesitamos hacer lo siguiente
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
