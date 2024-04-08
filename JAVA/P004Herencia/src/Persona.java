public class Persona {
    /*Todo lo que sea privado no se hereda a las clases hijas para ello utilizamos protected*/
    protected String nombre;
    protected String genero;
    protected int edad;
    protected String direccion;
    public Persona(){
        this.nombre ="No tiene nombre";

    }
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, String genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", genero='").append(genero).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", direccion de memoria='").append(super.toString()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
