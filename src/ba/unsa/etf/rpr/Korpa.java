package ba.unsa.etf.rpr;

public class Korpa {
    Artikl popis[] = new Artikl[50];

    public boolean dodajArtikl(Artikl a) {
        return true;
    }

    public Artikl[] getArtikli() {
       return popis;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        return popis[0];
    }

    public int dajUkupnuCijenuArtikala() {
        return 10;
    }
}
