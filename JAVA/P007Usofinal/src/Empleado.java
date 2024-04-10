public class Empleado extends Persona{
    /*Si quitamos el final de la clase Persona esta clase Empleado va a
    * poder heredar de la clase padre Persona*/

    @Override
    public void imprimir(){
        System.out.println("Escribo desde Empleado el cual pesa " + Persona.MEDIA_KG);
    }
}
