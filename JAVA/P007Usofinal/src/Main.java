//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Vamos ha hacer uso de la palabra final");
        Persona person = new Persona();
        Empleado empleado = new Empleado();
        /*De este modo vamos a poder ver como estamos sobreescribiendo
        * dos metodos iguales*/

        System.out.println("El peso de el empleado es de " + Persona.MEDIA_KG);

        /*Al ser un objeto de tipo final no vamos a poder cambiar el objeto pero
        * si su contenido veamoslo*/
        final Persona persona1 = new Persona();

        persona1.setNombre("Juan");
        System.out.println("persona1 = " + persona1.getNombre());

        /*Si quisiesemos hacer esto (persona1 = new Persona()) es decir crear
        * un nuevo objeto el cual es va a ser referenciado por persona1 y nos
        * olvidaremos de el anterior objeto no podríamos hacerlo ya que final
        * dice oye que si creas una variable que apunte a un Objeto del tipo
        * Persona no vas a poder apuntar a ninguno mas pero eso si si lo que
        * quieres es cambiar el contenido de ese objeto y solo ese te dejo*/

        person.imprimir();
        empleado.imprimir();
    }
}