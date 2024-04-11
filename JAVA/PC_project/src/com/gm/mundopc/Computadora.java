package com.gm.mundopc;

import java.util.Arrays;

public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadora;

    /*CONSTRUCTORES*/
    public Computadora(){
        this.idComputadora = ++contadorComputadora;
    }

    public Computadora(String nombre, Monitor monitor, Raton raton, Teclado teclado){
        this();
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
        this.nombre = nombre;
    }
    /*FIN CONSTRUCTORES E INICIO DE METODOS*/
    public int getIdComputadora() {
        return idComputadora;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*Metodo toString()*/
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computadora{");
        sb.append("idComputadora=").append(idComputadora);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", monitor=").append(monitor);
        sb.append(", teclado=").append(teclado);
        sb.append(", raton=").append(raton);
        sb.append('}');
        return sb.toString();
    }
}
