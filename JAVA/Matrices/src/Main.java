import java.util.Random;
import java.util.random.RandomGenerator;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int edades[][] = new int[3][2];

        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                edades[i][j] = random.nextInt(100);
                System.out.println("Posicion ("+ i + ", " + j + ") " + edades[i][j]);
            }
        }
        String frutas[][] = {{"Naranja","Pera"}, {"Zarzamora","Sandia","Aguacate"}};
        imprimir(frutas);

        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Marcos");

        imprimir(personas);

    }
    public static void imprimir(Object matriz[][]){
        System.out.println("\n");
        for(int i=0; i< matriz.length; i++){
            /*le especificamos que son las frutas[i] para que vaya a la fila 0 y diga
             * cuantas columnas tenemos en esta fila y te dice tres por ejemplo y
             * te va a dar la cantidad de columnas de esa fila en concreto*/
            for(int j=0;j< matriz[i].length;j++){
                System.out.println("Posicion ("+ i + ", " + j + ") " + matriz[i][j]);
            }
        }
    }
}