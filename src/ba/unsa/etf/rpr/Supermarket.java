package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl proizvodi[] = new Artikl[];
    int ukupno = 0;
    public Artikl[] getArtikli() {
        return proizvodi;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbacit=null;
        for(int i = 0; i<ukupno; i++)
            if(proizvodi[i].getKod()==kod){
                izbacit=proizvodi[i];
                ukupno--;
                for(int j=i; j<ukupno-1; j++)
                    proizvodi[j]=proizvodi[j+1];
            }
        return izbacit;
    }

    public void dodajArtikl(Artikl a) {
        proizvodi[ukupno].setCijena(a.getCijena());
        proizvodi[ukupno].setKod(a.getKod());
        proizvodi[ukupno].setNaziv(a.getNaziv());
        ukupno++;
    }
}
