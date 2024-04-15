public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;

    public Escritor(String name, double sueldo, TipoEscritura tipoEscritura) {
        super(name, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return "Nombre: " + this.name + "\nSueldo: " + this.sueldo + "\nTipo de Escritura: " + this.tipoEscritura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Escritor{");
        sb.append("tipoEscritura=").append(tipoEscritura);
        sb.append(", name='").append(name).append('\'');
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
}
