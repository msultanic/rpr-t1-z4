package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void izbaciArtiklSaKodom() { //testiramo rubni slučaj, šta ako želimo izbaciti artikl kojeg nema
        Supermarket tes = new Supermarket();
        String s = null;
        tes.izbaciArtiklSaKodom(s);
    }

    @Test
    void dodajArtikl() {
        Artikl probni = new Artikl("Igracka",3000,"6");
        Supermarket s = new Supermarket();
        s.dodajArtikl(probni);
    }
}