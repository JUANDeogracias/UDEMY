public class ClubTenis {
    private String nombre;
    private Socio socio;
    public ClubTenis() {
        nombre = "No tiene nombre";
    }
    public void setName(String nombre){
        this.nombre = nombre;
    }

    public String getName() {
        return nombre;
    }

    public void setSocio(Socio socio){
        this.socio = socio;
    }
}
