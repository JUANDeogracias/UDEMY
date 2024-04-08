//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Cuando utilizamos un metodo static hacemos referencia a la clase y por el contrario
        * si hablamos de contexto dinamico es todo aquel que no hace uso de la palabra static
        * y cuando nos referimos a este estamos hablando de objetos o mejor dicho instancias
        * de la clase.*/
        Persona per1 = new Persona("Juan");
        Persona per2 = new Persona("Pedro");
        System.out.println(Persona.getContadorPersonas());
    }
}