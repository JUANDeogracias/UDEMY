public class Persona {
    private String nombre;


    /**
     * @param nombre
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
        this.nombre = "No tiene nombre";
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
