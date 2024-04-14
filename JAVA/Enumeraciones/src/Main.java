//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(Dias.LUNES);
//        indicarDiaSemana(Dias.LUNES);
        System.out.println("Continente num 4: " + Continentes.OCEANIA);
        System.out.println("Num paises en este continente: " + Continentes.OCEANIA.getPaises());
    }
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana: Lunes");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana: Martes");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana: Miercoles");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana: Jueves");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana: Viernes");
                break;
            default:
                System.out.println("Dia no valido");
                break;
        }
    }
}