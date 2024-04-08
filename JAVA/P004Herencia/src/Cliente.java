import java.util.Date;
public class Cliente extends Persona{

    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorId;

    public Cliente(Date fechaRegistro, boolean vip,
                   String nombre, String genero, int edad, String direccion){
        /*Si utilizamos super debe de ser la primera linea en nuestro constructor*/
        super(nombre,genero,edad,direccion);
        this.idCliente = ++Cliente.contadorId;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
