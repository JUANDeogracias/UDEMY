import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación de una instancia de la clase Club de tenis
        ClubTenis club = new ClubTenis();

        // Establecemos el nombre del club
        System.out.println("¿Cuál quieres que sea el nombre del club de tenis?");
        String nombreClub = scanner.nextLine();
        club.setName(nombreClub);

        // Establecemos el número de socios
        System.out.println("¿Cuántos socios tiene dicho Club?");
        int numSocios = Integer.parseInt(scanner.nextLine());

        // Creamos un objeto para cada Socio
        Socio[] socios = new Socio[numSocios];
        for (int i = 0; i < numSocios; i++) {
            System.out.println("Datos del socio " + (i + 1) + ":");
            System.out.print("ID del socio: ");
            String idSocio = scanner.nextLine();
            System.out.print("Nombre del socio: ");
            String nombreSocio = scanner.nextLine();
            System.out.print("Apellidos del socio: ");
            String apellidosSocio = scanner.nextLine();

            // Crear un nuevo objeto Socio y almacenarlo en el array
            socios[i] = new Socio(idSocio, nombreSocio, apellidosSocio);
        }
        for(int i = 0; i < socios.length; i++) {
            int numSocio = i;
            numSocio +=1;
            System.out.println("El socio numero se llama: " + numSocio + " "+ socios[i].getNombre());
        }

        // Cerrar el scanner
        scanner.close();
    }
}
