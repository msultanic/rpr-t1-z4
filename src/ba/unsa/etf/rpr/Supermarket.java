package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl proizvodi[] = new Artikl[1000];
    int ukupno = 0;
    public Artikl[] getArtikli() {
        return proizvodi;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbacit=null;
        for(int i = 0; i<ukupno; i++)
            if(proizvodi[i].getKod().equals(kod)){
                izbacit=proizvodi[i];
                ukupno--;
                for(int j=i; j<ukupno-1; j++)
                    proizvodi[j]=proizvodi[j+1];
            }
        return izbacit;
    }

    public void dodajArtikl(Artikl a) {
        proizvodi[ukupno]=new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
        ukupno++;
    }
}
