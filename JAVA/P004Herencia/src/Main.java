import java.util.Date;
public class Main {
    public static void main(String[] args) {
//        Empleado empleado1 = new Empleado("Juan", 5000.0);
//        System.out.println("Empleado1 = " + empleado1);
        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha, true, "Karla", "F", 28, "Saturno 15");
        System.out.println("cliente1 = " + cliente1);
    }
}