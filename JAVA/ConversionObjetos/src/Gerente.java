public class Gerente extends Empleado{
    private String departamento;
    public Gerente(String name, double sueldo, String departamento) {
        super(name, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String obtenerDetalles() {
        return super.obtenerDetalles() + "\ny el departamento se llama " + departamento;
    }
}
