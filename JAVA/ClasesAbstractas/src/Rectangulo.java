public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(String TipoFigura){
        super(TipoFigura);
    }
    public void dibujar(){
        System.out.println("Se imprime un: " + getClass().getSimpleName());
    }
}
