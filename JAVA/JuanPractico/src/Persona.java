public class Persona {
    private String nombre;
    private int edad;
    private float altura;
    private int idPersonas;
    private static int numPersonas = 0;

    public Persona(String nombre, int edad, float altura){
        this.idPersonas = ++Persona.numPersonas;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", altura=").append(altura);
        sb.append(", numero personas=").append(numPersonas);
        sb.append('}');
        return sb.toString();
    }
}
