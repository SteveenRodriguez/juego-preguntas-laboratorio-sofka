package com.softka.juegopreguntas.model;

import com.softka.juegopreguntas.controller.TestJuego;
import com.softka.juegopreguntas.jugador.Jugador;

import java.util.Scanner;

/**
 * Clase abstracta historico, en la que se actualiza el historico del juego y se puede ver el historial.
 *
 *  @author Steveen, Daniel, Andrey
 *  @version 1.1.0
 *  @since 1.0.0
 */
public abstract class Historico {
    public final TestJuego testJuego = new TestJuego();

    /**
     * Método que actualiza el historico del juego.
     * @param jugador Jugador que será añadido al historico del juego
     */
    public void updateHistoricoJuego(Jugador jugador){
        PersistenciaDatos.agregarDatoJugador(jugador);
        PersistenciaDatos.almacenarDatos();
    }

    /**
     * Método que muestra el historial del juego.
     */
    public void verHistorial(){
        Scanner scanner = new Scanner(System.in);
        PersistenciaDatos.mostrarHistoricoJuego();
        System.out.println("Presione cualquier tecla, para volver al inicio.");
        scanner.nextLine();
        testJuego.bienvenidaJuego();
    }
}
