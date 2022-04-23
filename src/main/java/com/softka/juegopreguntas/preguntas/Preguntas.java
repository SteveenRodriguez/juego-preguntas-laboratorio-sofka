package com.softka.juegopreguntas.preguntas;

import java.util.Random;

/**
 * Enum de preguntas con sus opciones de respuestas
 */
public enum Preguntas {

    PREGUNTA_1("¿Dónde desemboca el río Amazonas?", "geografia", "En el mediterráneo", "En el canal de suez",
            "En el mar caribe", "En el océano Atlántico"),
    PREGUNTA_2("¿En qué país puedes visitar Machu Picchu?", "geografia", "En Bolivia", "En Chichen Itzá",
            "En el amazonas", "En Perú"),
    PREGUNTA_3("¿En qué cordillera se encuentra el Monte Everest?", "geografia", "Los Balcanes", "Ascraeus Mons",
            "Alpes suizos", "En el Himalaya"),
    PREGUNTA_4("¿Puedes nombrar el continente más grande de la tierra?", "geografia", "Antártida", "Asia", "Oceanía",
            "Africa"),
    PREGUNTA_5("¿Cuál es el desierto más grande del mundo?", "geografia", "Desierto de la Patagonia Oriental",
            "Desiertos australianos", "Desierto de Chihuahua", "Desierto del Sáhara"),
    PREGUNTA_6("¿Cuáles son las flores más famosas pintadas por Van Gogh?", "arte", "Flor de loto", "Rosas",
            "Margaritas", "Girasoles"),
    PREGUNTA_7("¿En qué arte destacó Isadora Duncan?", "arte", "Pintura", "Escultura", "Teatro", "Danza"),
    PREGUNTA_8("¿Qué parte de la capilla sixtina pintó Miguel angel?", "arte", "Las paredes", "Las bóvedas",
            "Las columnas", "El techo"),
    PREGUNTA_9("¿Qué civilización nos dejó como legado la Dama de Elche?", "arte", "Los sumerios", "Los fenicios",
            "Los cretenses", "Los íberos"),
    PREGUNTA_10("¿Qué autor firmó la ópera Rigoletto?", "arte", "Erik Satie", "Antonio Vivaldi", "Giacomo Puccini",
            "Giuseppe Verdi"),
    PREGUNTA_11("¿Cuál es la capital de la republica en el mundo de Star Wars?", "entretenimiento", "Tattoine",
            "Vespar", "lo'thal", "coruscant"),
    PREGUNTA_12("¿Qué le paso a Anakin Skywalker durante la batalla con el Conde Dooku?", "entretenimiento",
            "El perdio su ojo derecho", "Perdio su pierna derecha", "Perdio su pierna izquierda",
            "Perdio su mano derecha"),
    PREGUNTA_13("¿Quién hizo el papel del comandante Cody?", "entretenimiento", "Jay Laga'aia", "Joel Edgerton",
            "Ahmed Best", "Temuera Morrison"),
    PREGUNTA_14("¿Qué perdio Luke Skywalker en su pelea con Darth Vader?", "entretenimiento",
            "El perdio su ojo derecho", "Perdio su pierna derecha", "Perdio su pierna izquierda",
            "Perdio su mano derecha"),
    PREGUNTA_15("Segun el Emperador, ¿cuál era la debilidad de Luke Skywalker?", "entretenimiento",
            "Su fe en el Lado Luminoso de la Fuerza", "Su falta de vision",
            "Su resistencia al Lado Oscuro de la Fuerza", "Su fe en sus amigos"),
    PREGUNTA_16("El primer evento de la UFC se llevó a cabo en", "deporte", "2002", "1993", "1981", "1890"),
    PREGUNTA_17("¿De qué marca deportiva es el uniforme oficial de los luchadores?", "deporte", "Adidas", "New Balance",
            "Reebok", "Nike"),
    PREGUNTA_18("¿Pueden los luchadores llevar camiseta durante el combate?", "deporte", "Sí", "No",
            "Sólo los luchadores", "Sólo las luchadoras"),
    PREGUNTA_19("La jaula de la UFC es", "Un pentágono", "Un cuadrilátero", "deporte", "Un hexágono", "Un octógono"),
    PREGUNTA_20("¿Cuál de estos luchadores NO ha participado nunca en UFC?", "deporte", "Jhon Alvarez",
            "Conor McGregor.", "Anderson Silva", "Floyd Mayweather Jr"),
    PREGUNTA_21("De acuerdo a la Teoria de la Evolución, ¿qué tipo de variación es heredada?", "ciencia",
            "Variación ambiental", "La variación no es heredada", "variación topica", "Variación genética"),
    PREGUNTA_22("¿Cuál es la razón más probable por la que las avispas y abejas tienen rayas negras y amarillas?",
            "ciencia", "las rayas les ayudan a identificarse entre otras de su colonia",
            "Las rayas las hacen parecer inofensivas y así poder acercarse sigilosamente hacia sus víctimas",
            "Las rayas son atractivas para los pájaros y otros depredadores",
            "Las rayas avisan a otros animales que las avispas y abejas son peligrosas"),
    PREGUNTA_23("En el ciclo del Carbón, la descomposición sucede más rápidamente cuando el ambiente es", "ciencia",
            "Frío y Seco", "Frío y Humedo", "Cálido y seco", "Cálido y Húmedo"),
    PREGUNTA_24("¿Cuánta energía es transferida por un taladro eléctrico de 500 W en 30 segundos?", "ciencia", "6000 J",
            "25 J", "250 J", "15.000 J"),
    PREGUNTA_25("¿Hace cuánto tiempo calculan los científicos que nació el universo?", "ciencia",
            "13.900 millones de años", "137 millones de años", "1.370 millones de años", "13.700 millones de años");

    private Integer posicionRespuestaCorrecta;
    private String descripcion;
    private String categoriaPregunta;
    private String incorrecta1;
    private String incorrecta2;
    private String incorrecta3;
    private String correcta;

    /**
     * Constructor del Enum que inicializa los atributos
     *
     * @param descripcion     String
     * @param categoria       String
     * @param opcionFalsa1    String
     * @param opcionFalsa2    String
     * @param opcionFalsa3    String
     * @param opcionVerdadera String
     */
    Preguntas(String descripcion, String categoria, String opcionFalsa1, String opcionFalsa2, String opcionFalsa3,
              String opcionVerdadera) {
        this.descripcion = descripcion;
        this.categoriaPregunta = categoria;
        this.incorrecta1 = opcionFalsa1;
        this.incorrecta2 = opcionFalsa2;
        this.incorrecta3 = opcionFalsa3;
        this.correcta = opcionVerdadera;

    }

    /**
     * método que retorna la posición de la respuesta correcta
     *
     * @return Integer
     */
    public Integer posicionRespuestaCorrecta() {
        return posicionRespuestaCorrecta;
    }

    /**
     * método que envia la posición de la respuesta correcta
     *
     * @param posicionRespuestaCorrecta Integer
     */
    public void setPosicionRespuestaCorrecta(Integer posicionRespuestaCorrecta) {
        this.posicionRespuestaCorrecta = posicionRespuestaCorrecta;
    }

    /**
     * Método que retorna respuesta incorrecta 1
     *
     * @return String
     */
    public String incorrecta1() {
        return incorrecta1;
    }

    /**
     * Método que envia respuesta incorrecta 1
     *
     * @param incorrecta1 String
     */
    public void setIncorrecta1(String incorrecta1) {
        this.incorrecta1 = incorrecta1;
    }

    /**
     * Método que retorna respuesta incorrecta 2
     *
     * @return String
     */
    public String incorrecta2() {
        return incorrecta2;
    }

    /**
     * Método que envia respuesta incorrecta 2
     *
     * @param incorrecta2 String
     */
    public void setIncorrecta2(String incorrecta2) {
        this.incorrecta2 = incorrecta2;
    }

    /**
     * Método que retorna respuesta incorrecta 3
     *
     * @return String
     */
    public String incorrecta3() {
        return incorrecta3;
    }

    /**
     * Método que envia respuesta incorrecta 3
     *
     * @param incorrecta3 String
     */
    public void setIncorrecta3(String incorrecta3) {
        this.incorrecta3 = incorrecta3;
    }

    /**
     * Método que retorna respuesta correcta S
     * @return String
     */
    public String correcta() {
        return correcta;
    }
    /**
     * Método que envia respuesta correcta
     * @param correcta String
     */
    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }

    /**
     * Método que retorna descripción
     * @return String
     */
    public String descripcion() {
        return descripcion;
    }
    /**
     * Método que retorna descripción
     * @param descripcion String
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * método que retorna categoria de la pregunta
     * @return String
     */
    public String categoriaPregunta() {
        return categoriaPregunta;
    }

    /**
     * método que envia la categoria de la pregunta
     * @param categoriaPregunta String
     */
    public void setCategoriaPregunta (String categoriaPregunta) {
        this.categoriaPregunta = categoriaPregunta;
    }

    /**
     * Método que elije la pregunta y su respuesta correcta
     */
    public void mostrarPregunta() {
        System.out.println("\n\u001B[34m" + this.descripcion + "\u001B[0m\n");
        Random random = new Random();
        int nextInt = random.nextInt(5);
        if (nextInt > 3) {
            System.out.println("1. " + this.incorrecta2);
            System.out.println("2. " + this.incorrecta3);
            System.out.println("3. " + this.incorrecta1);
            System.out.println("4. " + this.correcta);
            this.setPosicionRespuestaCorrecta(4);
        } else if (nextInt >= 2) {
            System.out.println("1. " + this.incorrecta2);
            System.out.println("2. " + this.correcta);
            System.out.println("3. " + this.incorrecta1);
            System.out.println("4. " + this.incorrecta3);
            this.setPosicionRespuestaCorrecta(2);
        } else {
            System.out.println("1. " + this.incorrecta2);
            System.out.println("2. " + this.incorrecta1);
            System.out.println("3. " + this.correcta);
            System.out.println("4. " + this.incorrecta3);
            this.setPosicionRespuestaCorrecta(3);
        }
    }

}
