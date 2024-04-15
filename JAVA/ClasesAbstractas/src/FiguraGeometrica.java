public abstract class FiguraGeometrica {
    protected String TipoFigura;
    protected FiguraGeometrica(String TipoFigura) {
        this.TipoFigura = TipoFigura;
    }
    public abstract void dibujar();

    public String getTipoFigura() {
        return TipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        TipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FiguraGeometrica{");
        sb.append("TipoFigura='").append(TipoFigura).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
