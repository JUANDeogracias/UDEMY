//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*Al crear un arreglo no se va a poder redimensionar*/
        int edades[] = new int[3];

        System.out.println("edades = " + edades);
        int contador = 0;
        for(int i = 0; i < edades.length; i++){
            edades[i] = ++contador;
            System.out.println(edades[i]);
        }

        /*Ahora vamos a crear un array de objetos*/
        Persona personas[] = new Persona[3];
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Manolo");
        personas[2] = new Persona("Daniel");

        System.out.println("Personas  = " + personas[0]
                + ", " + personas[1] + ", " + personas[2]);

        String frutas[] = {"Pera", "Manzana"};
        for(int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }
    }
}