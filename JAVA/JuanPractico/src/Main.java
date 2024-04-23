import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numMaximo = 0;
        boolean error = false;
        System.out.println("Cuantas personas quieres que formen parte del club");

        int total_personas = comprobacionPersonas(error,miScanner, numMaximo);
        System.out.println("Total de personas = " + total_personas);

        Persona[] personas = new Persona[total_personas];
        int contador = 0;
        for(int i = 0; i < total_personas; i++) {
            System.out.println("Introduce un nombre para la persona " + ++contador);
            String nombre = miScanner.nextLine(); // Ahora funciona correctamente
            System.out.println("Introduce ahora su edad");
            int edad = miScanner.nextInt();
            System.out.println("Introduce su altura");
            float altura = miScanner.nextFloat();
            personas[i] = new Persona(nombre, edad, altura);
        }

        for(Persona persona : personas) {
            System.out.println("persona = " + persona);
        }

        miScanner.close();
    }

    public static int comprobacionPersonas(boolean error, Scanner miScanner, int numMaximo) {
        int cantidadPersonas = 0;

        do {
            cantidadPersonas = miScanner.nextInt();
            miScanner.nextLine(); // Consume la nueva línea restante
            if (cantidadPersonas <= numMaximo) {
                System.out.println("Vuelve a introducir otro valor mayor de " + numMaximo);
            } else {
                System.out.println("Registro de datos correctamente realizado");
                error=true;
            }
        } while (!error);

        return cantidadPersonas;
    }
}