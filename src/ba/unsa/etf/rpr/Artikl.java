package ba.unsa.etf.rpr;

public class Artikl {
    String naziv;
    String kod;
    int cijena;
    Artikl(String naziv,int cijena,String id){this.naziv=naziv; this.kod=id; this.cijena=cijena;}
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getKod() { return kod; }

    public int getCijena() {
        return cijena;
    }
}
