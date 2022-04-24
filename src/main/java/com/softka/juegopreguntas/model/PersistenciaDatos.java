package com.softka.juegopreguntas.model;


import com.softka.juegopreguntas.jugador.Jugador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Clase persistencias de datos
 * @author Steveen, Daniel, Andrey
 * @version 1.1.0
 * @since 1.0.0
 */

public class PersistenciaDatos {

    private static final ArrayList<Jugador> HISTORICO_JUEGO = new ArrayList<>();
    private static Logger logger = Logger.getLogger("");

    /**
     * almacena datos en archivo de texto plano
     */
    public static void almacenarDatos() {

        FileOutputStream salidaDatos;
        try {
            salidaDatos = new FileOutputStream("historico.txt");
            ObjectOutputStream escribiendoDatos = new ObjectOutputStream(salidaDatos);
            escribiendoDatos.writeObject(HISTORICO_JUEGO);
            escribiendoDatos.close();
        } catch (IOException e) {
            logger.warning("Error para guardar los datos en el archivo .txt\n" + e.getMessage());
        }
    }

    /**
     * Muestra del archivo de texto plano
     */
    public static void mostrarDatos() {
        FileInputStream entradaDatos;
        try {
            entradaDatos = new FileInputStream("historico.txt");
            ObjectInputStream mostrandoDatos = new ObjectInputStream(entradaDatos);

            // lista nueva para poder leer datos de los jugadores
            ArrayList<Jugador> jugadores = (ArrayList<Jugador>) mostrandoDatos.readObject();
            HISTORICO_JUEGO.addAll(jugadores);

        } catch (IOException | ClassNotFoundException e) {
            logger.warning("Error para mostrar datos de historial\n" + e.getMessage());
        }
    }

    /**
     * método para agregar el jugador al juego
     * @param jugador Jugador
     */
    public static void agregarDatoJugador(Jugador jugador) {
        HISTORICO_JUEGO.add(jugador);
    }

    /**
     * muestra el historico de jugadores y puntos
     */
    public static void mostrarHistoricoJuego() {
        HISTORICO_JUEGO.forEach((jugador) -> {
            System.out.println("Jugador: " + jugador.nombreJugador() + " Puntos: " + jugador.puntosJugador());
        });
    }
}
