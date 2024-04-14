public enum Continentes {
    EUROPA(46, "1.2 billones"),
    AMERICA(34, "2 billones"),
    ASIA(44, "5 billones"),
    OCEANIA(14, "4 billones"),
    AFRICA (53, "6 billones");

    private final int paises;

    //Definimos el constructor para inicializar los valores de el enum;
    Continentes(int paises, String habitantes){
        this.paises = paises;
    }

    public int getPaises(){
        return this.paises;
    }
}
