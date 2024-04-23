public class Aritmetica {
    //throws indica que posiblemente haya una excepcion
    public static int division(int numerador, int denominador) {
        if (denominador == 0) {
            //throw es arrojar en ingles sirve para crear un objeto
            throw new OperacionExcepcion("Division entre ceros");
        }else{
            return numerador / denominador;
        }
    }
}
