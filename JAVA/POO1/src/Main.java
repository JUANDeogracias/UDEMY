//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Los metodos estaticos no pueden acceder a el operador this
        Aritmetica ar1 = new Aritmetica();
        ar1.a = 3;
        ar1.b = 4;
        ar1.sumar();

        int  resultado = ar1.resultadoSumar(5, 8);
        System.out.println(resultado);
    }
}