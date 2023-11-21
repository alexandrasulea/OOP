public class Sofer {
    private String nume;
    private int vartsa;
    private int nrPermis;

    public Sofer( String nume, int varsta, int nrPermis)
    {
        this.nume=nume;
        this.vartsa=varsta;
        this.nrPermis=nrPermis;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setVartsa(int vartsa) {
        this.vartsa = vartsa;
    }

    public int getVartsa() {
        return vartsa;
    }

    public void setNrPermis(int nrPermis) {
        this.nrPermis = nrPermis;
    }

    public int getNrPermis() {
        return nrPermis;
    }

}
