//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Cuando trabajamos con javabeans no solemos pasar los atributos directamente
        //a el constructor
        Persona persona = new Persona();

        persona.setNombre("Juan");
        persona.setApellido("Pérez");

        System.out.println("persona = " + persona.toString());
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("persona.getApellido() = " + persona.getApellido());
    }
}