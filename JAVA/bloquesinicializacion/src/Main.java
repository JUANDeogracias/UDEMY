//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*Bloques de inicializacion (IMPORTANTE: se llaman antes de el constructor)
        * por otra parte pueden ser o no estaticos*/
        Persona person = new Persona();
        System.out.println("person = " + person.getIdPersona());
        Persona person2 = new Persona();
        System.out.println("person = " + person2.getIdPersona() + " " +person2.toString());
    }
}