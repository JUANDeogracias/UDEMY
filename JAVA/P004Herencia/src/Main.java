public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan",
                "femenino", 19, "JuanAntonio...");
        Empleado empleado1 = new Empleado();
        Persona persona2 = new Persona("juan");
        System.out.println("empleado1 = " + persona2);
        System.out.println("empleado1 = " + empleado1);
    }
}