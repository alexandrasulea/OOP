public class Rezervor {
    private int litriMax;
    private int litriMin;

    Rezervor( int litriMax, int litriMin)
    {
        this.litriMax=litriMax;
        this.litriMin=litriMin;
    }

    public void setLitriMax(int litriMax) {
        this.litriMax = litriMax;
    }

    public int getLitriMax() {
        return litriMax;
    }

    public void setLitriMin(int litriMin) {
        this.litriMin = litriMin;
    }

    public int getLitriMin() {
        return litriMin;
    }
}
