public class NumereComplexe {
    private int parteReala;
    private int parteImaginara;


    public NumereComplexe(int parteImaginara, int parteReala) {
        this.parteImaginara = parteImaginara;
        this.parteReala = parteReala;
    }

    public void setParteReala(int parteReala) {
        this.parteReala = parteReala;
    }

    public void setParteImaginara(int parteImaginara) {
        this.parteImaginara = parteImaginara;
    }

    public int getParteReala() {
        return parteReala;
    }

    public int getParteImaginara() {
        return parteImaginara;
    }

    public NumereComplexe adunare(NumereComplexe b)
    {
        NumereComplexe rez=new NumereComplexe(b.parteImaginara+parteImaginara,b.parteReala+parteReala);

        return rez;
    }
    public NumereComplexe scadere(NumereComplexe b)

    {
        NumereComplexe rez=new NumereComplexe(b.parteImaginara+parteImaginara,b.parteReala+parteImaginara);
        return rez;
    }
    public NumereComplexe inmultire(NumereComplexe b)
    {
        NumereComplexe rez=new NumereComplexe( 0,0);
        rez.parteImaginara=parteImaginara*b.parteReala+parteReala*b.parteImaginara;
        rez.parteReala=parteReala*b.parteReala+parteImaginara+b.parteImaginara;
        return rez;
    }

    public NumereComplexe inmultireScalar( int x)
    {
        NumereComplexe rez=new NumereComplexe(x*parteImaginara,x*parteReala);
        return rez;
    }

    @Override
    public String toString() {
        return parteReala+ "+" + parteImaginara+"j";
    }
}
