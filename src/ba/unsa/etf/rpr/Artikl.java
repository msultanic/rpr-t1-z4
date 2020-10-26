package ba.unsa.etf.rpr;

public class Artikl {
    String naziv;
    String kod;
    String cijena;

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public void setCijena(String cijena) {
        this.cijena = cijena;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getKod() {
        return kod;
    }

    public String getCijena() {
        return cijena;
    }
}
