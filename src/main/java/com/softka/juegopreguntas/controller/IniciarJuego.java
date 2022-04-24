package com.softka.juegopreguntas.controller;

import com.softka.juegopreguntas.jugador.Jugador;
import com.softka.juegopreguntas.model.Historico;
import com.softka.juegopreguntas.preguntas.Preguntas;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase que inicia el juego
 *
 *  @author Steveen, Daniel, Andrey
 *  @version 1.1.0
 *  @since 1.0.0
 */
public class IniciarJuego extends Historico {
    private final ArrayList<Preguntas> preguntasSeleccionadas;
    private final Jugador jugador;
    private Integer puntosJugador;

    /**
     * constructor de la clase que inicia las propiedades
     */
    public IniciarJuego(){
        this.preguntasSeleccionadas = new ArrayList<>();
        this.jugador = new Jugador();
        this.puntosJugador = 0;
    }

    /**
     * método que muestra el incio del juego
     */
    public void comenzarJuego() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su nombre:");
        this.jugador.setNombreJugador(sc.nextLine());
        ronda("\n\t\u001B[45m" + "Ronda 1" + "\u001B[0m");
        ronda("\n\t\u001B[45m" + "Ronda 2" + "\u001B[0m");
        ronda("\n\t\u001B[45m" + "Ronda 3" + "\u001B[0m");
        ronda("\n\t\u001B[45m" + "Ronda 4" + "\u001B[0m");
        ronda("\n\t\u001B[45m" + "Ronda 5" + "\u001B[0m");
        this.jugador.setPuntosJugador(this.puntosJugador);
        System.out.println("Congratulations " + this.jugador.nombreJugador()
                + "\n Puntaje Total = " + this.puntosJugador);
        updateHistoricoJuego(this.jugador);
        testJuego.bienvenidaJuego();
    }

    /**
     * método que escoge la ronda del juego
     * @param ronda String
     */
    private void ronda(String ronda) {
        System.out.println(ronda);
        System.out.println("Si deseas retirarte digite \"salir\"");
        // buscar preguntas nuevas
        escogerPregunta("arte", ronda);
        escogerPregunta("deporte", ronda);
        escogerPregunta("geografia", ronda);
        escogerPregunta("entretenimiento", ronda);
        escogerPregunta("ciencia", ronda);
    }

    /**
     * Método que selecciona la pregunta de acuerdo al nivel
     * @param categoria Sting
     * @param nivel String
     */
    private void escogerPregunta(String categoria, String nivel) {
        Scanner scanner = new Scanner(System.in);
        Preguntas pregunta;
        boolean sinMostrar;
        int opcion = 0;
        do {
            pregunta = getPregunta(categoria);
            sinMostrar = agregarPregunta(pregunta);
        } while (sinMostrar);

        boolean ciclo;
        do {
            try {
                String opcTexto = scanner.nextLine();
                if (opcTexto.equalsIgnoreCase("salir")) {
                    System.out.println("Gracias por Jugar " + this.jugador.nombreJugador());
                    this.jugador.setPuntosJugador(this.puntosJugador);
                    updateHistoricoJuego(this.jugador);
                    System.exit(0);
                }
                opcion = Integer.parseInt(opcTexto);
                if (opcion < 1 || opcion > 4) {
                    System.out.println("debe ingresar un valor de los que estan en las respuestas");
                    ciclo = true;
                } else {
                    ciclo = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("debe ingresar un numero");
                ciclo = true;
            }
        } while (ciclo);

        comprobarRespuesta(opcion, pregunta, nivel);
    }

    /**
     * Método que obtiene la pregunta
     *
     * @param categoriaPregunta String con la categoría de la pregunta
     * @return Pregunta
     */
    private Preguntas getPregunta(String categoriaPregunta) {
        boolean preguntaEncontrada = true;
        Preguntas[] valores = Preguntas.values();
        Random random = new Random();
        Preguntas valorPregunta;
        do {
            int iteracion = random.nextInt(valores.length);
            valorPregunta = valores[iteracion];
            if (valorPregunta.getCategoriaPregunta().equals(categoriaPregunta)){
                preguntaEncontrada = false;
            }
        } while (preguntaEncontrada);

        return valorPregunta;
    }

    /**
     * Método que muestra pregunta seleccionada
     * @param pregunta Pregunta
     * @return Boolean
     */
    private boolean agregarPregunta(Preguntas pregunta) {
        boolean contienePregunta = this.preguntasSeleccionadas.contains(pregunta);
        if (!contienePregunta) {
            this.preguntasSeleccionadas.add(pregunta);
            pregunta.mostrarPregunta();
            System.out.println("\nDigite respuesta");
        }
        return contienePregunta;
    }

    /**
     * Método que verifica la respuesta
     * @param respuestaJugador Integer
     * @param pregunta Pregungas
     * @param ronda String
     */
    private void comprobarRespuesta(Integer respuestaJugador, Preguntas pregunta, String ronda) {
        if (pregunta.posicionRespuestaCorrecta() == respuestaJugador) {
            switch (ronda) {
                case "ronda 1":
                    this.puntosJugador += 50;
                    break;
                case "ronda 2":
                    this.puntosJugador += 100;
                    break;
                case "ronda 3":
                    this.puntosJugador += 150;
                    break;
                case "ronda 4":
                    this.puntosJugador += 250;
                    break;
                case "ronda 5":
                    this.puntosJugador += 300;
                    break;
            }
            System.out.println("Opción elegida correcta! \nTotal puntos: " + this.puntosJugador);
        } else {
            System.out.println("Opción elegida incorrecta! :/ la correcta era " + pregunta.posicionRespuestaCorrecta() +
                    "\nGAME OVER!!!");
            this.jugador.setPuntosJugador(this.puntosJugador);
            updateHistoricoJuego(this.jugador);
            testJuego.bienvenidaJuego();
        }
    }

}
