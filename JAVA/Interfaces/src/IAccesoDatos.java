public interface IAccesoDatos {
    //Todo va a ser una constante, no tiene constructores y todos los metodos van
    //a ser abstractos
    int MAX_REGISTRO = 10;

    void insertar();

    void listar();

    void actualizar();

    void eliminar();
}
