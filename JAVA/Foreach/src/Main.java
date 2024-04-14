//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*For each es un for mejorado*/
        int edades [] = {5, 6, 7, 8};

        /*For each con tipos simples*/
        for(int edad : edades){
            System.out.println("edad= "+ edad);
        }

        /*For each con objetos*/
        Persona personas[] = {new Persona("Juan"), new Persona("Carla"),
                new Persona("Agustin")};
        /*persona que es la variable temporal que creamos en el for para imprimir el valor
        * de el array de objetos personas tiene la misma funcion de un puntero es decir:
        * apuntar a la cada uno de los objetos de la clase persona*/
        for(Persona persona : personas){
            System.out.print("\nPersona "+ persona);
        }
    }
}