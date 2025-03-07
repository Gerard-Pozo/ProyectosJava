import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.mycompany.pt10.electrodomestics.objectes.Electrodomestic;
import com.mycompany.pt10.electrodomestics.objectes.Rentadora;
import com.mycompany.pt10.electrodomestics.objectes.Televisio;

/**
 * Els tests fets per els electrodomestics
 * 
 * @author Gerard Pozo i Eric Serrano
 */
public class ElectrodomesticTest {

    /**
     * Test per electrodomestics amb parametres per defecte
     */
    @Test
    public void testElectrodomesticPerDefecte() {
        // Creem l'objecte
        Electrodomestic e = new Electrodomestic();
        // Comprovem el valor per defecte del preu
        assertEquals(100, e.getPreuBase(), 0.001);
        // Comprovem el pes per defecte
        assertEquals(5, e.getPes(), 0.001);
        // Comprovem el consum energetic per defecte
        assertEquals('F', e.getConsumEnergetic());
        // Comprovem el color per defecte
        assertEquals("Blanc", e.getColor());
        /*
         * Comprovem el preu final
         * Preu: 100
         * Lletra: F -> 10
         * Pes: 5 -> 10
         * 
         * 100 + 10 + 10 = 120
         */
        assertEquals(120, e.preuFinal(), 0.001);
    }

    /**
     * Test per electrodomestics amb els parametres de preu i pes
     */
    @Test
    public void testElectrodomesticPreuPes() {
        // Creem l'objecte
        Electrodomestic e = new Electrodomestic(200, 60);
        // Comprovem el preu
        assertEquals(200, e.getPreuBase(), 0.001);
        // Comprovem el pes
        assertEquals(60, e.getPes(), 0.001);
        // Comprovem el consum energetic per defecte
        assertEquals('F', e.getConsumEnergetic());
        // Comprovem el color per defecte
        assertEquals("Blanc", e.getColor());
        /*
         * Comprovem el preu final
         * Preu: 200
         * Lletra: F -> 10
         * Pes: 60 -> 80
         * 
         * 200 + 10 + 80 = 290
         */
        assertEquals(290, e.preuFinal(), 0.001);
    }

    /**
     * Test per electrodomestics amb tots els parametres
     */
    @Test
    public void testElectrodomesticComplet() {
        // Creem l'objecte
        Electrodomestic e = new Electrodomestic(200.5, -10, 'C', "Negre");
        // Comprovem el preu
        assertEquals(200.5, e.getPreuBase(), 0.001);
        // Comprovem el pes
        assertEquals(5, e.getPes(), 0.001);
        // Comprovem el consum energetic
        assertEquals('C', e.getConsumEnergetic());
        // Comprovem el color
        assertEquals("Negre", e.getColor());
        /*
         * Comprovem el preu final
         * Preu: 200.5
         * Lletra: C -> 60
         * Pes: 5 -> 10
         * 
         * 200 + 60 + 10 = 270
         */
        assertEquals(270.5, e.preuFinal(), 0.001);
    }

    /**
     * Test per rentadores amb parametres per defecte
     */
    @Test
    public void testRentadoraPerDefecte() {
        // Creem l'objecte
        Rentadora r = new Rentadora();
        // Comprovem la carrega
        assertEquals(5, r.getCarrega(), 0.001);
        // Comprovem el preu
        assertEquals(100, r.getPreuBase(), 0.001);
        // Comprovem el pes
        assertEquals(5, r.getPes(), 0.001);
        // Comprovem el consum energetic per defecte
        assertEquals('F', r.getConsumEnergetic());
        // Comprovem el color per defecte
        assertEquals("Blanc", r.getColor());
        /*
         * Comprovem el preu final
         * Preu: 100
         * Lletra: F -> 10
         * Pes: 5 -> 10
         * Carrega: 5 -> 0
         * 
         * 100 + 10 + 10 + 0 = 120
         */
        assertEquals(120, r.preuFinal(), 0.001);
    }

    /**
     * Test per rentadores amb els parametres de preu i pes
     */
    @Test
    public void testRentadoraPreuPes() {
        // Creem l'objecte
        Rentadora r = new Rentadora(230, 50);
        // Comprovem la carrega
        assertEquals(5, r.getCarrega(), 0.001);
        // Comprovem el preu
        assertEquals(230, r.getPreuBase(), 0.001);
        // Comprovem el pes
        assertEquals(50, r.getPes(), 0.001);
        // Comprovem el consum energetic per defecte
        assertEquals('F', r.getConsumEnergetic());
        // Comprovem el color per defecte
        assertEquals("Blanc", r.getColor());
        /*
         * Comprovem el preu final
         * Preu: 230
         * Lletra: F -> 10
         * Pes: 50 -> 50
         * Carrega: 5 -> 0
         * 
         * 230 + 10 + 50 + 0 = 290
         */
        assertEquals(290, r.preuFinal(), 0.001);
    }

    /**
     * Test per rentadores amb tots els parametres
     */
    @Test
    public void testRentadoraComplet() {
        // Creem l'objecte
        Rentadora r = new Rentadora(-230, 50, 10, 'Z', "Vermell");
        // Comprovem la carrega
        assertEquals(5, r.getCarrega(), 0.001);
        // Comprovem el preu
        assertEquals(50, r.getPreuBase(), 0.001);
        // Comprovem el pes
        assertEquals(10, r.getPes(), 0.001);
        // Comprovem el consum energetic
        assertEquals('F', r.getConsumEnergetic());
        // Comprovem el color
        assertEquals("Vermell", r.getColor());
        /*
         * Comprovem el preu final
         * Preu: 50
         * Lletra: F -> 10
         * Pes: 10 -> 10
         * Carrega: 5 -> 0
         * 
         * 50 + 10 + 10 + 0 = 70
         */
        assertEquals(70, r.preuFinal(), 0.001);
    }

    /**
     * Test per televisors amb parametres per defecte
     */
    @Test
    public void testTelevisioPerDefecte() {
        // Creem l'objecte
        Televisio t = new Televisio();
        // Comprovem la mida
        assertEquals(20, t.getMida(), 0.001);
        // Comprovem si es 4K
        assertEquals(false, t.isResolucio4K());
        // Comprovem el preu
        assertEquals(100, t.getPreuBase(), 0.001);
        // Comprovem el consum energetic
        assertEquals('F', t.getConsumEnergetic());
        // Comprovem el color
        assertEquals("Blanc", t.getColor());
        /*
         * Comprovem el preu final
         * Preu: 100
         * Lletra: F -> 10
         * Pes: 5 -> 10
         * Mida: 20 -> 0
         * 4K: false -> 0
         * 
         * 100 + 10 + 10 = 120
         */
        assertEquals(120, t.preuFinal(), 0.001);
    }

    /**
     * Test per televisors amb els parametres de preu i pes
     */
    @Test
    public void testTelevisioPreuPes() {
        // Creem l'objecte
        Televisio t = new Televisio(-5, 50);
        // Comprovem la mida
        assertEquals(20, t.getMida(), 0.001);
        // Comprovem si es 4K
        assertEquals(false, t.isResolucio4K());
        // Comprovem el preu
        assertEquals(100, t.getPreuBase(), 0.001);
        // Comprovem el consum energetic
        assertEquals('F', t.getConsumEnergetic());
        // Comprovem el color
        assertEquals("Blanc", t.getColor());
        /*
         * Comprovem el preu final
         * Preu: 100
         * Lletra: F -> 10
         * Pes: 50 -> 50
         * Mida: 20 -> 0
         * 4K: false -> 0
         * 
         * 100 + 10 + 50 = 160
         */
        assertEquals(160, t.preuFinal(), 0.001);
    }

    /**
     * Test per televisors amb tots els parametres
     */
    @Test
    public void testTelevisioComplet() {
        // Creem l'objecte
        Televisio t = new Televisio(41, true, 145.6, 70, 'A', "Blau");
        // Comprovem la mida
        assertEquals(41, t.getMida(), 0.001);
        // Comprovem si es 4K
        assertEquals(true, t.isResolucio4K());
        // Comprovem el preu
        assertEquals(145.6, t.getPreuBase(), 0.001);
        // Comprovem el consum energetic
        assertEquals('A', t.getConsumEnergetic());
        // Comprovem el color
        assertEquals("Blau", t.getColor());
        /*
         * Comprovem el preu final
         * Preu: 145.6
         * Lletra: A -> 100
         * Pes: 70 -> 80
         * 4K: true -> 0
         * Mida: 41 -> 30%
         * 
         * (145.6 + 100 + 80 + 50) * 1.3 = 488.28
         */
        assertEquals(488.28, t.preuFinal(), 0.001);
    }
}
