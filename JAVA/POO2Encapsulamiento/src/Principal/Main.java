package Principal;

import java.util.Scanner;
/*Import Clases sirve para importar lo que halla dentro de el paquete Clases
* en este caso tenemos la clase persona*/
import Clases.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");

        // Leer el valor ingresado por el usuario
        String name = scanner.nextLine();
        System.out.print("Ingrese un salario: ");
        double salary = scanner.nextDouble();

        System.out.print("¿Desea eliminar la persona? (s/n): ");
        //Va a leer la respuesta siempre que la persona de como resultado True or False
        Boolean eliminated = scanner.nextBoolean();
        //Hemos creado dos paquetes en el que uno guardo las clases y en el otro el main
        //Para acceder tenemos que hacer lo siguiente
        Persona persona = new Persona(name, salary, eliminated);

        persona.MostrarInfo();
    }
}