public enum Dias {
    LUNES(11),
    MARTES(12),
    MIERCOLES(88),
    JUEVES(50),
    VIERNES(93);

    private final int dias;

    Dias(int dias){
        this.dias = dias;
    }
    public int getDias(){
        return this.dias;
    }

}
