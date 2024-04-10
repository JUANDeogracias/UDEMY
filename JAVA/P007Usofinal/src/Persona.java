public /*final*/ class Persona {
    /*Al poner a Persona como public "final" class esta clase persona no
    * va a poder tener otras clases hijas.*/

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*Ahora vamos a ver el uso de la palabra final en las llamadas constantes.
    * Siempre va a acompañada de static para que pueda ser utilizada en cualquier caso
    * Al ser de el tipo final es como una constante no se puede modificar/
    */
    public final static float MEDIA_KG = 65.f;

    /* Lo mismo ocurre con los metodos si usamos public final imprimir() en
    * la clase padre en la clase hija no se va a poder utilizar por otra parte
    * como voy a hacer a continuacion se pueden sobreescribir metodos*/
    public void imprimir(){
        System.out.println("Escribo desde persona");
    }
}
