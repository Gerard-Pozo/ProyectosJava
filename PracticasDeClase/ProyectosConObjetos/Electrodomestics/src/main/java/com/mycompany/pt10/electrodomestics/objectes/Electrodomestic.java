/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt10.electrodomestics.objectes;

/**
 * <p>
 * Clase Electrodomestic
 * </p>
 * 
 * <p>
 * Té els parametres: preuBase, pes, consumEnergetic, color
 * </p>
 * 
 * <p>
 * Es pot construir amb parametres per defecte o assignant els parametres
 * preuBase i pes, o amb tots els Parametres
 * </p>
 * 
 * <p>
 * Si es posa un parametre no admet s'assignara un parametre per defecte
 * </p>
 * 
 * <p>
 * Taula per visualitzar els preus segons l'eficiencia energetica i el pes
 * </p>
 * 
 * <pre>
 * --------------------------------------------------
 * |    Lletra    |    Preu    | Grandaria |  Preu  |
 * |--------------|------------|---------------------
 * |      A       |     100    |    >80KG  |  100   |
 * |      B       |      80    |  50-80KG  |   80   |
 * |      C       |      60    |  20-50KG  |   50   |
 * |      D       |      50    |   0-20KG  |   10   |
 * |      I       |      30    |-----------|--------|
 * |      F       |      10    |
 * -----------------------------
 * </pre>
 * 
 * 
 * @author Gerard Pozo i Eric Serrano
 */
public class Electrodomestic {
    // Constants
    /**
     * El preu del electrodomestic per defecte
     */
    protected static final double PREU_BASE_PER_DEFECTE = 100;
    /**
     * El preu minim que pot tenir un electrodomestic
     */
    private static final int PREU_MINIM = 0;
    /**
     * Els kilograms que pesa per defecte l'electrodomestic
     */
    protected static final double PES_PER_DEFECTE = 5;
    /**
     * El minim que poden pesar els electrodomestics
     */
    private static final int PES_MINIM = 0;
    /**
     * L'eficiencia energetica per defecte del electrodomestic
     */
    protected static final char CONSUM_ENERGETIC_PER_DEFECTE = 'F';
    /**
     * Una llista de totes les lletres disponibles
     */
    private static final char[] CONSUM_ENERGETIC_DISPONIBLES = { 'A', 'B', 'C', 'D', 'I', 'F' };
    /**
     * El color que té l'electrodomestic per defecte
     */
    protected static final String COLOR_PER_DEFECTE = "Blanc";
    /**
     * Una llista amb tots els colors que estàn disponibles
     */
    private static final String[] COLORS_DISPONIBLES = { "Blanc", "Negre", "Vermell", "Blau", "Gris" };

    // Parametres
    /**
     * El preu del electrodomestic
     */
    protected double preuBase;
    /**
     * Els kilograms que pesa el electrodomestic
     */
    protected double pes;
    /**
     * Lletra que indica l'eficiencia energetica del electrodomestic
     */
    protected char consumEnergetic;
    /**
     * Color del electrodomestic
     */
    protected String color;

    // Constructors
    /**
     * Constructor per defecte
     */
    public Electrodomestic() {
        this(PREU_BASE_PER_DEFECTE, PES_PER_DEFECTE, CONSUM_ENERGETIC_PER_DEFECTE, COLOR_PER_DEFECTE);
    }

    /**
     * Constructor que demana un preu base i un pes
     * 
     * @param preuBase Preu del electrodomestic
     * @param pes      Pes en kilograms del electrodomestic
     */
    public Electrodomestic(double preuBase, double pes) {
        this(preuBase, pes, CONSUM_ENERGETIC_PER_DEFECTE, COLOR_PER_DEFECTE);
    }

    /**
     * Constructor que demana un preu base, un pes, un consum energetic i un color
     * 
     * @param preuBase        Preu del electrodomestic
     * @param pes             Pes en kilograms del electrodomestic
     * @param consumEnergetic Lletra d'eficiencia energetica del electrodomestic
     * @param color           Color del electrodomestic
     */
    public Electrodomestic(double preuBase, double pes, char consumEnergetic, String color) {
        // Assignem el preu per defecte si és menor que el minim
        this.preuBase = (preuBase < PREU_MINIM) ? PREU_BASE_PER_DEFECTE : preuBase;
        // Assignem el pes per defecte si és menor que el minim
        this.pes = (pes < PES_MINIM) ? PES_PER_DEFECTE : pes;
        comprovarConsumEnergetic(consumEnergetic);
        comprovarColor(color);
    }

    // Getters
    /**
     * Retorna el preu del electrodomestic
     * 
     * @return preu
     */
    public double getPreuBase() {
        return preuBase;
    }

    /**
     * Retorna el pes del electrodomestic
     * 
     * @return pes
     */
    public double getPes() {
        return pes;
    }

    /**
     * Retorna la lletra de consum energetic del electrodomestic
     * 
     * @return consum energetic
     */
    public char getConsumEnergetic() {
        return consumEnergetic;
    }

    /**
     * Retorna el color del electrodomestic
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }

    // Metodes
    /**
     * Comprova si la lletra introduïda coincideix amb les lletres disponibles
     * Si no coincideix posarà la lletra per defecte
     * 
     * @param lletra Demana la lletra d'eficiencia energetica del electrodomestic
     */
    private void comprovarConsumEnergetic(char lletra) {
        this.consumEnergetic = CONSUM_ENERGETIC_PER_DEFECTE;
        for (char lletraDisponible : CONSUM_ENERGETIC_DISPONIBLES) {
            if (lletraDisponible == (Character.toUpperCase(lletra))) {
                // Assignem la lletra però ens assegurem de tornarla en majuscula
                this.consumEnergetic = Character.toUpperCase(lletra);
                break;
            }
        }
    }

    /**
     * Comprova que el color introduït coincideixi amb els colors disponibles
     * Si no coincideix posarà el color per defecte
     * 
     * @param color Color del electrodomestic
     */
    private void comprovarColor(String color) {
        this.color = COLOR_PER_DEFECTE;
        // Recorrem tots els colors disponibles
        for (String colorDisponible : COLORS_DISPONIBLES) {
            // Comprovem que el color coincideixi
            if (colorDisponible.equalsIgnoreCase(color)) {
                // Si coincideix ho assignem i finalitzem el bucle
                this.color = color;
                break;
            }
        }
    }

    /**
     * Calcula el preu total de l'electrodomestic, comptant l'eficiencia energetica
     * i el pes
     * 
     * @return preu total
     */
    public double preuFinal() {
        double preu = 0;
        // Sumem el preu segons la lletra
        switch (consumEnergetic) {
            case 'A' -> preu += 100;
            case 'B' -> preu += 80;
            case 'C' -> preu += 60;
            case 'D' -> preu += 50;
            case 'I' -> preu += 30;
            case 'F' -> preu += 10;
            default -> System.out.println("ERROR: Lletra no trobada.");
        }
        // Sumem el preu segons el pes
        if (pes > 80) {
            preu += 100;
        } else if (pes > 50 && pes <= 80) {
            preu += 80;
        } else if (pes >= 20 && pes <= 50) {
            preu += 50;
        } else if (pes >= 0 && pes < 20) {
            preu += 10;
        }

        // Tornem el preu del electrodomestic més el pes i el consum energetic
        return preu + preuBase;
    }

    /**
     * Retorna totes les dades del electrodomestic
     * 
     * @return electrodomestic
     */
    @Override
    public String toString() {
        return "Electrodomestic"
                + "\nPreu Base " + preuBase
                + "\nPes " + pes
                + "\nConsum Energetic " + consumEnergetic
                + "\nColor " + color
                + "\nPreu Final " + preuFinal();
    }

}
