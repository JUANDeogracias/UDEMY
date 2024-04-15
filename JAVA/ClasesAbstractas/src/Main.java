//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Las clases abstractas no pueden tener instancias de una clase pero si hacer lo siguiente
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        System.out.println("figura = " + figura);
        figura.dibujar();
    }
}