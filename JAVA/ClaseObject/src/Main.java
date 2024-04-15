public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        /*Ahora vamos a preguntar si los dos objetos son iguales o no (comparaciones en
        * memoria)*/

        if(empleado1 == empleado2){
            System.out.println("Los objetos son iguales en cuanto a memoria");
        }else{
            System.out.println("Los objetos no son iguales en cuanto a memoria");
        }

        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en cuanto a contenido");
        }else{
            System.out.println("Los objetos no son iguales en cuanto a contenido");
        }

        //El valor de hascode es distinto para cada objeto ya que es unico para cada uno
    }

}