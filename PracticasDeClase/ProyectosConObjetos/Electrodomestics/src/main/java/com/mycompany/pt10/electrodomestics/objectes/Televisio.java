/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt10.electrodomestics.objectes;

/**
 * <p>
 * Classe Televisio
 * </p>
 * 
 * <p>
 * Té els parametres mida, resolució 4K i els heredats de la classe
 * Electrodomestic
 * </p>
 * 
 * <p>
 * Es pot construir amb parametres per defecte, amb un preu i unpes, o amb una
 * mida, un preu, un consum energetic i un color
 * </p>
 * 
 * <p>
 * Si s'introdueix una mida menor a la mida mínima s'assignarà la mida per
 * defecte
 * </p>
 *
 * @author Gerard Pozo i Eric Serrano
 */
public class Televisio extends Electrodomestic {
    // Constants
    /**
     * La mida que té la televisió per defecte
     */
    private static final double MIDA_PER_DEFECTE = 20;
    /**
     * Les polzades mínimes que pot tenir una televisio
     */
    private static final int MIDA_MINIMA = 0;
    /**
     * Les polzades máximes que pot tenir una televisio sense tenir que pagar més
     */
    private static final double MIDA_MAXIMA_SENSE_INCREMENT = 40;
    /**
     * El que s'incrementa el preu si la mida del televisor supera el máxim
     */
    private static final double INCREMENT_MIDA = 0.3;
    /**
     * La resolució que té la televisió per defecte
     */
    private static final boolean RESOLUCIO4K_PER_DEFECTE = false;
    /**
     * El que es cobrará si la resolució del televisor es 4K
     */
    private static final int PREU_RESOLUCIO4K = 50;

    // Parametres
    /**
     * La mesura de la televisió en polzades
     */
    private double mida;
    /**
     * Per sapiguer si la resolució és o no és 4K
     */
    private boolean resolucio4K;

    // Constructors
    /**
     * Constructor per defecte
     */
    public Televisio() {
        this(MIDA_PER_DEFECTE, RESOLUCIO4K_PER_DEFECTE, PREU_BASE_PER_DEFECTE, PES_PER_DEFECTE,
                CONSUM_ENERGETIC_PER_DEFECTE, COLOR_PER_DEFECTE);
    }

    /**
     * Constructor que demana un preu i un pes
     * 
     * @param preu Preu de la televisio
     * @param pes  Pes en kilograms de la televisio
     */
    public Televisio(double preu, double pes) {
        this(MIDA_PER_DEFECTE, RESOLUCIO4K_PER_DEFECTE, preu, pes, CONSUM_ENERGETIC_PER_DEFECTE, COLOR_PER_DEFECTE);
    }

    /**
     * Constructor que demana una mida, si la resolució és 4k, un preu, un consum
     * energetic i un color
     * 
     * @param mida            Mida en polzades de la televisio
     * @param resolucio4K     Si la resolució de la televisió és 4k
     * @param preu            Preu de la televisio
     * @param pes             Pes en kilograms de la televisio
     * @param consumEnergetic Lletra d'eficiencia energetica de la televisio
     * @param color           Color de la televisio
     */
    public Televisio(double mida, boolean resolucio4K, double preu, double pes, char consumEnergetic, String color) {
        super(preu, pes, consumEnergetic, color);
        this.mida = (mida < MIDA_MINIMA) ? MIDA_PER_DEFECTE : mida;
        this.resolucio4K = resolucio4K;
    }

    // Getters
    /**
     * Retorna la mesura en polzades de la televisio
     * 
     * @return mida
     */
    public double getMida() {
        return mida;
    }

    /**
     * Retorna true o false, si la televisió és 4k
     * 
     * @return resolució 4K
     */
    public boolean isResolucio4K() {
        return resolucio4K;
    }

    // Metodes
    /**
     * Calcula el preu total de la televisio, tenint en compta si medeix més del
     * limit i si es 4K
     * 
     * @return preu
     */
    @Override
    public double preuFinal() {
        double preu = super.preuFinal();

        if (resolucio4K) {
            preu += PREU_RESOLUCIO4K;
        }

        if (mida > MIDA_MAXIMA_SENSE_INCREMENT) {
            preu = (preu * INCREMENT_MIDA) + preu;
        }

        return preu;
    }

    /**
     * Retorna totes les dades del televisor
     * 
     * @return televisio
     */
    @Override
    public String toString() {
        return "Televisio"
                + "\nPreu Base " + preuBase
                + "\nPes " + pes
                + "\nConsum Energetic " + consumEnergetic
                + "\nColor " + color
                + "\nPreu Final " + preuFinal();
    }
}
