package com.softka.juegopreguntas.controller;

import com.softka.juegopreguntas.jugador.Jugador;
import com.softka.juegopreguntas.model.PersistenciaDatos;
import com.softka.juegopreguntas.preguntas.Preguntas;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase de test juego
 *  @author Steveen, Daniel, Andrey
 *  @version 1.1.0
 *  @since 1.0.0
 */
public class TestJuego {
    IniciarJuego iniciarJuego;
    private final ArrayList<Preguntas> preguntasSeleccionadas;
    private final Jugador jugador;
    private int puntosJugador;
    private Preguntas preguntas;

    /**
     * contructor de la clase que inicializa las propiedades
     */
    public TestJuego() {
        this.preguntasSeleccionadas = new ArrayList<>();
        this.jugador = new Jugador();
        this.puntosJugador = 0;
    }

    /**
     * Método de bienvenida al juego
     */
    public void bienvenidaJuego() {
        iniciarJuego = new IniciarJuego();
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO A QUIEN QUIERE SER INTELIGENTE \n\n");
        System.out.println("1. Comenzar a jugar");
        System.out.println("2. Mostrar historial de jugadores anteriores");
        System.out.println("3.  Salir del juego");
        System.out.println("Digite número de la opción que desees realizar:");
        Integer opcionUsuarioMenu =Integer.parseInt( sc.nextLine());
        boolean ciclo;
        do {
            try {
                if (opcionUsuarioMenu < 1 || opcionUsuarioMenu > 3) {
                    System.out.println("No puedes ingresar una opción menor a 1 o mayor a 3");
                    ciclo = true;
                } else {
                    ciclo = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número");
                ciclo = true;
            }
        } while (ciclo);

        switch (opcionUsuarioMenu) {
            case 1 -> iniciarJuego.comenzarJuego();
            case 2 -> iniciarJuego.verHistorial();
            default -> System.exit(0);
        }
    }

}
