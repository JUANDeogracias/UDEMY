import org.w3c.dom.ls.LSOutput;

public class Persona {
    private int id;
    private String name;
    private static int contadorPersonas;

    /*El objetivo es que el contador incremente cada vez que se cree un objeto*/
    public Persona(String name){
        this.name = name;
        /*Al llamar a un metodo estatico es recomendable hacer lo siguiente en vez
        * de utilizar this*/
        Persona.contadorPersonas++;
        this.id = Persona.contadorPersonas;
    }

    public static int getContadorPersonas(){
        return contadorPersonas;
    }

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "DATOS \nPersona: \n- id: " + this.id + "\n- " + this.name;
    }
}
