import javax.lang.model.SourceVersion;


public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        
        /*Para realizar un control de errores hacemos lo siguiente*/
        try{
          resultado = 10/0;
          resultado = Aritmetica.division(10, 0);
        }catch (OperacionExcepcion e){
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        } catch (Exception e){
            //Tambien llamada pila de excepciones e.printStackTrace permite controlar
            // las excepciones
            System.out.println("Ocurrió un error de tipo Excepcion:");
            e.printStackTrace(System.out);
            //Para obtener el mensaje que pusimos en la excepcion hacemos un getMessage
            //Sirve para que el usuario vea que tipo de error tiene sin ver todo lo anterior
            System.out.println("\t\t¡"+e.getMessage()+"!");
        }
        //el bloque finally se ejecuta siempre haya o no una excepcion
        finally{
            System.out.println("Se revisó la división entre cero");
        }
        System.out.println("resultado = " + resultado);
    }
}