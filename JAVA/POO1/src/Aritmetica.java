public class Aritmetica {
    //Los tipos boolean tienen como valor por defecto false
    int a;
    int b;


    public int sumar(){
        return this.a + this.b;
    }

    public int resultadoSumar(int arg1, int arg2){
        System.out.print("\nSuma es igual a: ");
        this.a = arg1;
        this.b = arg2;
        return sumar();
    }
}
