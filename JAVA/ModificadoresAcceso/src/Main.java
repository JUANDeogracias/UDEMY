
import Paquete1.*;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        clase1 clase = new clase1();
//        Al ser clase1 de tipo publico podremos acceder a esta desde cualquier lado
//        clase.metodo1();
        System.out.println(clase.atributoPublico);
        clase.metodoPublico();



    }
}