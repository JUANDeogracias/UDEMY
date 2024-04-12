package com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;
    public Orden(){
        idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras < MAX_COMPUTADORAS){
            this.computadoras[contadorComputadoras++] = computadora;
        }else{
            System.out.println("Has superado el limite "+ Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden(){
        System.out.println("\t--ORDEN--");
        System.out.println("idOrden = " + idOrden);
        System.out.println("computadoras: ");
        for(int i=0; i<this.contadorComputadoras;i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
