public class Empleado {
    protected String name;
    protected double sueldo;
    public Empleado(String name, double sueldo) {
        this.name = name;
        this.sueldo = sueldo;
    }
    public String obtenerDetalles(){
        return "Nombre: " + this.name + "\nSueldo: " + this.sueldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("name='").append(name).append('\'');
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
}
