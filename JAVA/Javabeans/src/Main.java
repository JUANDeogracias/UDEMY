
public class Main {
    public static void main(String[] args) {
        //Cuando trabajamos con javabeans no solemos pasar los atributos directamente
        //a el constructor
        Persona persona = new Persona();
        
        persona.setNombre("Juan");
        persona.setApellido("Pérez");

        System.out.println("persona = " + persona.toString());


    }
}