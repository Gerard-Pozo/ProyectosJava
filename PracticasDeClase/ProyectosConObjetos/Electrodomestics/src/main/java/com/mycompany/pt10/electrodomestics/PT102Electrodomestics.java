/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pt10.electrodomestics;

import com.mycompany.pt10.electrodomestics.objectes.Electrodomestic;
import com.mycompany.pt10.electrodomestics.objectes.Rentadora;
import com.mycompany.pt10.electrodomestics.objectes.Televisio;

/**
 * En aquesta clase ferem un array Electrodomestic, i l'omplirem amb les clases
 * que hem creat, i utilitzant instanceOf sumarem els preus de tots els
 * electrodomestics però separant-los per el seu tipus
 *
 * @author Gerard Pozo i Eric Serrano
 */
public class PT102Electrodomestics {

    public static void main(String[] args) {
        // Creem l'array
        Electrodomestic[] electrodomestics = new Electrodomestic[10];
        // Assignem electrodomestics per a cada posició de l'array
        electrodomestics[0] = new Electrodomestic();
        electrodomestics[1] = new Electrodomestic(200, 60);
        electrodomestics[2] = new Electrodomestic(300, 70, 'A', "Negre");
        electrodomestics[3] = new Rentadora();
        electrodomestics[4] = new Rentadora(400, 80);
        electrodomestics[5] = new Rentadora(200.4, 50.5, 23.77, 'B', "Gris");
        electrodomestics[6] = new Televisio();
        electrodomestics[7] = new Televisio(500, 90);
        electrodomestics[8] = new Televisio(600, true, 2000, 23.56, 'C', "Blau");
        electrodomestics[9] = new Televisio(700, false, 1000, 15.5, 'A', "Vermell");

        // Variables que utilitzarem per emmagatzemar quant costen els electrodomestics
        // de cada tipus i conjuntament
        double preuElectrodomestics = 0;
        double preuRentadores = 0;
        double preuTelevisions = 0;

        // Recorrem l'array
        for (Electrodomestic e : electrodomestics) {
            if (e instanceof Televisio) {
                preuTelevisions += e.preuFinal();
            } else if (e instanceof Rentadora) {
                preuRentadores += e.preuFinal();
            } else if (e instanceof Electrodomestic) {
                preuElectrodomestics += e.preuFinal();
            }
        }

        // Mostrem el resultat
        System.out.println("Preu total Electrodomestics: " + preuElectrodomestics + "€");
        System.out.println("Preu total Rentadores: " + preuRentadores + "€");
        System.out.println("Preu total Televisions: " + preuTelevisions + "€");
    }
}
