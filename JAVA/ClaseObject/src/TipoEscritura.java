public enum TipoEscritura {
    CLASICA("Escritura a mano"),
    MODERNO("Escritura digital");

    private final String descripcion;

    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
