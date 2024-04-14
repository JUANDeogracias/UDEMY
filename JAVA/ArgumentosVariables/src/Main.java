//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        variosParametros("Juan",1,2,3,4,5,6,7,8,9,10);
        //llamada a la funcion imprimirNumeros
        imprimirNumeros(1, 2, 3, 4, 5, 6, 7, 8, 9);

    }

    /*En caso de queres insertar un argumento y a parte de ese un varargs necesitamos
    * que este varargs se situe al final de la llamada a la funcion como podemos ver ahora*/
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }

    /*Mediante (int... nombre) vamos a poder pasar a la funcion el numero que
    * de parametros que queramos de modo que lo convertirá automaticamente en un array*/
    private static void imprimirNumeros(int... numbers){
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}