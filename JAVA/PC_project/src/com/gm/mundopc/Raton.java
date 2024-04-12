package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    /*Le ponemos final a idRaton para que no se pueda modificar una vez
    * se añade el idRaton*/
    private final int idRaton;
    private static int contadorRaton;
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRaton;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raton{");
        sb.append("idRaton= ").append(idRaton);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
