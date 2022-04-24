package com.softka.juegopreguntas.controller;

import java.util.Scanner;

/**
 * Clase de test juego
 *
 *  @author Steveen, Daniel, Andrey
 *  @version 1.1.0
 *  @since 1.0.0
 */
public class TestJuego {
    IniciarJuego iniciarJuego;

    /**
     * contructor de la clase que inicializa las propiedades
     */
    public TestJuego() {

    }

    /**
     * Método de bienvenida al juego
     */
    public void bienvenidaJuego() {
        iniciarJuego = new IniciarJuego();
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO A QUIEN QUIERE SER INTELIGENTE \n\n" +
                    "1. Comenzar a jugar" +
                    "\n2. Mostrar historial de jugadores anteriores" +
                    "\n3. Salir del juego" +
                    "\nDigite número de la opción que desees realizar:");
        Integer opcionUsuarioMenu =Integer.parseInt(sc.nextLine());
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
            case 1:
                iniciarJuego.comenzarJuego();
                break;
            case 2:
                iniciarJuego.verHistorial();
                break;
            default:
                System.exit(0);
                break;
        }
    }

}
