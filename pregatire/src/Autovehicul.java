import java.awt.*;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private int  vitezaCurenta;
    private int VitezaMaxima;
    private int VitezaTreaptaCurenta;
    private int NumarTrepte;
    private Sofer conducator;
    private Rezervor rezervor;
    public Autovehicul( String marca,Color culoare, int vitezaCurenta,int VitezaMaxima, int VitezaTreaptaCurenta, int NumarTrepte, Sofer conducator, Rezervor rezervor)
    {
        this.marca=marca;
        this.culoare=culoare;
        this.vitezaCurenta=vitezaCurenta;
        this.VitezaMaxima=VitezaMaxima;
        this.VitezaTreaptaCurenta=getVitezaTreaptaCurenta();
        this.NumarTrepte=NumarTrepte;
        this.conducator=conducator;
        this.rezervor=rezervor;

    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getCuloare() {
        return culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public void setNumarTrepte(int numarTrepte) {
      this.NumarTrepte = numarTrepte;
    }

    public int getNumarTrepte() {
        return NumarTrepte;
    }

    public int getVitezaCurenta() {
        return vitezaCurenta;
    }

    public void setVitezaCurenta(int vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public int getVitezaMaxima() {
        return VitezaMaxima;
    }

    public void setVitezaMaxima(int VitezaMaxima) {
        VitezaMaxima = VitezaMaxima;
    }

    public int getVitezaTreaptaCurenta() {
        return VitezaTreaptaCurenta;
    }

    public void setVitezaTreaptaCurenta(int vitezaTreaptaCurenta) {
        VitezaTreaptaCurenta = vitezaTreaptaCurenta;
    }
    public void accelerare (int delta)
    {
        vitezaCurenta=vitezaCurenta+delta;
        if(vitezaCurenta>VitezaMaxima)
        {
            vitezaCurenta=VitezaMaxima;
        }

    }
    public void decelerare(int delta)
    {
        vitezaCurenta=vitezaCurenta-delta;
        if (vitezaCurenta<0)
        {
            vitezaCurenta=0;
        }
    }
    public void oprire()
    {
        VitezaTreaptaCurenta=0;
        vitezaCurenta=0;
    }
    public void trepteViteza(int delta)
    {    VitezaTreaptaCurenta=VitezaTreaptaCurenta+delta;
        if(VitezaTreaptaCurenta<0)
        {
            VitezaTreaptaCurenta=0;
        }
        if( VitezaTreaptaCurenta>NumarTrepte)
        {
            VitezaTreaptaCurenta=NumarTrepte;
        }
    }
    @Override
    public String toString(){

        return " autovehicolul are cap min " + rezervor.getLitriMin()+ " si cap max "+ rezervor.getLitriMax() + "soferul se numeste "+ conducator.getNume() + "si are varsta "+ conducator.getVartsa() + " si are numarul de permis  "+ conducator.getNrPermis()+"Autovehicolul este "+ culoare+ " si are marca " + marca+ " viteza maxima este "+ VitezaMaxima+" viteza curenta este " + vitezaCurenta+" si are treapta de viteza "+VitezaTreaptaCurenta+" cu nr de trepte "+NumarTrepte;
    }
}




