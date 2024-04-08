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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isEliminated() {
        return eliminated;
    }

    public void setEliminated(boolean eliminated) {
        this.eliminated = eliminated;
    }

    /*El metodo toString lo que va a hacer es retornar la salida a modo de cadena*/
    public String toString() {
        return "Nombre: " + this.name + " ,salario: " + this.salary;
    }
}
