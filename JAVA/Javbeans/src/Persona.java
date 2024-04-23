import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String apellido;

    /*Si queremos utilizar Javabeans necesitamos de almenos un constructor vacío además todos
     * los atributos han de ser privados y tienen que tener un get y un set asociados*/
    public Persona(){

    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
