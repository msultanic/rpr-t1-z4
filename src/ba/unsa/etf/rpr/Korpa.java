package ba.unsa.etf.rpr;

public class Korpa {
    Artikl popis[] = new Artikl[50];
    int ukupno=0;

    public boolean dodajArtikl(Artikl a) {
        popis[ukupno]=a;
        ukupno++;
        return true;
    }

    public Artikl[] getArtikli() {
       return popis;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl vrati=null; //nekoliko puta sam ovo stavio
        for(int i=0; i<ukupno; i++){
            if(popis[i].getKod()==kod) {
                vrati = popis[i];
                ukupno--;
                for(int j=i; j<ukupno-1; j++)
                    popis[j]=popis[j+1];
            }
        }
        ukupno--;
        return vrati;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0; i<ukupno; i++)
            suma+=popis[i].getCijena();
        return suma;
    }
}
