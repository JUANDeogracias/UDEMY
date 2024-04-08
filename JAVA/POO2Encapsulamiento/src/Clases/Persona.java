package Clases;

public class Persona {
    private String name;
    private double salary;
    private boolean eliminated;
    public Persona(String name, double salary, boolean eliminated){
        this.name = name;
        this.salary = salary;
        this.eliminated = eliminated;
    }

    public void MostrarInfo(){
        System.out.println("Nombre: " + name);
        System.out.println("Salario: " + salary);
        System.out.println("Eliminado: " + eliminated);
    }
}
