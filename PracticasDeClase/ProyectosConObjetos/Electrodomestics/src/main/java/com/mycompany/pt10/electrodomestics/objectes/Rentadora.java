/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt10.electrodomestics.objectes;

/**
 * <p>
 * Clase Rentadora
 * </p>
 * 
 * <p>
 * Té els parametres carrega i els heredats de la classe Electrodomestic
 * </p>
 * 
 * <p>
 * Es pot construir amb parametres per defecte, amb un preu i un pes, o amb
 * una carrega, un preu, un consum energetic i un color
 * </p>
 * 
 * <p>
 * Si s'introdueix una carrega menor a la carrega mínima s'assignarà la carrega
 * per defecte
 * </p>
 * 
 * @author Gerard Pozo i Eric Serrano
 */
public class Rentadora extends Electrodomestic {
    // Constants
    /**
     * La quantitat de kilograms que admet la rentadora per defecte
     */
    private static final int CARREGA_PER_DEFECTE = 5;
    /**
     * Els kilograms máxims que pot contenir una rentadora sense tenir que pagar més
     */
    private static final int CARREGA_MAXIMA = 30;
    /**
     * El kilograms minims que pot contenir una rentadora
     */
    private static final int CARREGA_MINIMA = 0;
    /**
     * El que es cobrara si una rentadora supera la carrega máxima
     */
    private static final int PREU_CARREGA_MAXIMA = 50;

    // Parametres
    /**
     * La quantitat de kilograms que admet la rentadora
     */
    private double carrega;

    // Constructors
    /**
     * Constructor per defecte
     */
    public Rentadora() {
        this(CARREGA_PER_DEFECTE, PREU_BASE_PER_DEFECTE, PES_PER_DEFECTE, CONSUM_ENERGETIC_PER_DEFECTE,
                COLOR_PER_DEFECTE);
    }

    /**
     * Constructor que demana un preu i un pes
     * 
     * @param preu Preu de la rentadora
     * @param pes  Pes en kilograms de la rentadora
     */
    public Rentadora(double preu, double pes) {
        this(CARREGA_PER_DEFECTE, preu, pes, CONSUM_ENERGETIC_PER_DEFECTE, COLOR_PER_DEFECTE);
    }

    /**
     * Constructor que demana una carrega, un preu, un consum energetic i un color
     * 
     * @param carrega         Els kilograms que admet la rentadora
     * @param preu            Preu de la rentadora
     * @param pes             Pes en kilograms de la rentadora
     * @param consumEnergetic Lletra d'eficiencia energetica de la rentadora
     * @param color           Color de la rentadora
     */
    public Rentadora(double carrega, double preu, double pes, char consumEnergetic, String color) {
        super(preu, pes, consumEnergetic, color);
        // Assignem la carrega per defecte si és menor que el minim
        this.carrega = (carrega < CARREGA_MINIMA) ? CARREGA_PER_DEFECTE : carrega;
    }

    // Getters
    /**
     * Retorna la carrega de la rentadora
     * 
     * @return carrega
     */
    public double getCarrega() {
        return carrega;
    }

    // Metodes
    /**
     * Calcula el preu total de l'electrodomestic, comptant l'eficiencia energetica
     * i el pes
     * 
     * @return preu total
     */
    @Override
    public double preuFinal() {
        // Truquem al metode pare per assignar el preu
        double preu = super.preuFinal();

        // Afegim al preu sempre que la carrega sigui més gran que la carrega máxima
        if (carrega > CARREGA_MAXIMA) {
            preu += PREU_CARREGA_MAXIMA;
        }
        return preu;
    }

    /**
     * Retorna totes les dades de la rentadora
     * 
     * @return rentadora
     */
    @Override
    public String toString() {
        return "Rentadora"
                + "\nPreu Base " + preuBase
                + "\nPes " + pes
                + "\nConsum Energetic " + consumEnergetic
                + "\nColor " + color
                + "\nPreu Final " + preuFinal();
    }
}
