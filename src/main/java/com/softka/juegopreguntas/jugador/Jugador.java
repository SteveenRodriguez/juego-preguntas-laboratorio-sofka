package com.softka.juegopreguntas.jugador;

import java.io.Serializable;

/**
 * Clase jugador que implementa interface Serializable
 *
 * @author Steveen, Daniel, Andrey
 *
 * @version 1.1.0
 * @since 1.0.0
 */
public class Jugador implements Serializable {

    private String nombreJugador;
    private Integer puntosJugador;

    /**
     * Constructor por defecto de la clase
     */
    public Jugador() {
        this.nombreJugador = "";
        this.puntosJugador = 0;
    }

    /**
     * Contructor de la clase con argumentos
     * @param nombreJugador String
     * @param puntosJugador Integer
     */
    public Jugador(String nombreJugador, Integer puntosJugador) {
        this.nombreJugador = nombreJugador;
        this.puntosJugador = puntosJugador;
    }

    /**
     * Getters and Setters
     */
    public String nombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Integer puntosJugador() {
        return puntosJugador;
    }

    public void setPuntosJugador(Integer puntosJugador) {
        this.puntosJugador = puntosJugador;
    }

    /**
     * Método toString de la clase
     * @return String
     */
    @Override
    public String toString() {
        return "Jugador{" + "Nombre = " + nombreJugador + ", puntos = " + puntosJugador + '}';
    }

}
