//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
/*
        int personas[] = new int [3];

        personas[0] = 2;
        personas[1] = 3;
        personas[2] = 4;

        for(int persona : personas){
            System.out.println("valor de la persona "+ persona);
        }
*/

        boolean error = false;

        int sumatorio = 0;
        int contador = 0;

        final int numeroSalida = 0;
        System.out.println("--INTRODUCE UN NUMERO EN PANTALLA--");
        int numero;

        while(!error) {
            if((numero = scanner.nextInt()) != numeroSalida) {
                System.out.println("Perfecto procesando el datos correctamente. " +
                        "Ingrese uno nuevo");
                sumatorio += numero;
            }
            else{
                System.out.println("El numero ingresado es incorrecto. Finalizando el programa...");
                error = true;
            }
            contador++;
        }

        float resultado = (float) sumatorio / (--contador);
        float total = resultado;
        System.out.println("--La media da como resultado " + resultado + "--");

        scanner.close();
    }
}