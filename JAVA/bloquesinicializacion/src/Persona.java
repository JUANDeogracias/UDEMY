public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    /*Creacion de un bloque de inicializacion estatico. SUPER IMPORTANTE: este bloque al
    * ser estatico se va a iniciar solo una vez a diferencia de el dinamico que se inicia
    * cada vez que lo utilicemos*/
    static{
        System.out.println("Ejecucion bloque estatico");
        /*Dentro de este podemos inicializar las variables estaticas
        * No se puede acceder a el operador this ya que utilizamos variables estaticas*/
        ++Persona.contadorPersonas;
        //No se puede hacer lo siguiente que esta en comentarios ya que no es estatico
        //idPersona = 10;
    }

    /*Creacion de un bloque de inicializacion no estatico*/
    {
        System.out.println("Ejecucion bloque no estatico");
        /*Dentro de este podemos inicializar las variables no estaticas*/
        /*Hacemos lo de contadorPersonas++ ya que la primera vez que se incrementa contadorPersonas
        * va a ser 1 pero como solo se inicia se incrementa una vez en el bloque estatico es
        * por ello que le ponemos ++ despues de la variable ya que la primera vez el 1 se le asigna
        * a idPersona y automaticamente despues cuando cree el usuario otra objeto de la clase Persona
        * el id va a ser dos*/
        this.idPersona = Persona.contadorPersonas++;
    }

    /*Vamos a crear ahora un constructor*/
    public Persona() {
        System.out.println("Ejecucion constructor");
    }
    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
}
