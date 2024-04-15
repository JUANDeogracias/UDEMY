//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*Clases envolventes de tipos primitivos:
        * int - Integer
        * long - Long
        * float - Float
        * double - Double
        * boolean - Boolean
        * byte - Byte
        * char - Character
        * short - Short
        * **PORQUE UTILIZAR LAS CLASES ENVOLVENTES?**: 
        * Basicamente porque estas clases tienen atributos y metodos*/
        
//        int entero = 10;
        /*AUTBOXING*/
        Integer entero = 10;
        System.out.println("Entero como clase envolvente= " + entero);
        /*Aunque a continuacion el resultado en pantalla sea igual al poner .toString
        * vamos a convertir lo que tenga la clase envolvente entero en una cadena de texto*/
        System.out.println("entero.toString() = " + entero.toString());
        System.out.println("entero.byteValue() = " + entero.byteValue());
        System.out.println("entero.doubleValue() = " + entero.doubleValue());
        
        /*UNBOXING*/
        //A continuacion obtenemos el resultado de la clase envolvente y creamos una nueva
        //variable de tipo primitivo que va a tener el valor de la clase envolvente
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
        
    }
}