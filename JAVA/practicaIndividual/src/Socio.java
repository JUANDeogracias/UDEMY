public class Socio extends ClubTenis{
    private String idSocio;
    private String nombre;
    private String apellidos;
    private boolean genero = true;

    public Socio(String idSocio, String nombre, String apellidos) {
        this.idSocio = idSocio;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void menuSocio(ClubTenis club){
        System.out.println("--" + club.getName() + "--");
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(idSocio);
    }

    public String getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(String idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
