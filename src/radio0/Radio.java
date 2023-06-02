package radio0;

public class Radio {
    private boolean eingeschaltet;
    private int lautstaerke;
    private double frequenz;

    public Radio(boolean istAn, int lautstaerke, double frequenz) {
        this.eingeschaltet = true;
        if (lautstaerke > 10) lautstaerke = 10;
        if (lautstaerke < 0) lautstaerke = 0;
        this.lautstaerke = lautstaerke;
        waehleSender(frequenz);
        this.eingeschaltet = istAn;
    }

    public Radio() {
        this(false, 5, 85.0);
    }

    @Override
    public String toString() {
        return "Radio an: " + eingeschaltet +
                ", Freq=" + frequenz +
                ", Laut=" + lautstaerke;
    }

    public void lauter() {
        if (this.eingeschaltet) {
            this.lautstaerke++;
        }
    }

    public void leiser() {
        if (this.eingeschaltet) {
            this.lautstaerke--;
        }
    }

    public void an() {
        this.eingeschaltet = true;
    }

    public void aus() {
        this.eingeschaltet = false;
    }

    public void waehleSender(double frequenz) {
        if (eingeschaltet) {
            if (frequenz > 110.0 || frequenz < 85.0) {
                this.frequenz = 99.9;
            } else {
                this.frequenz = frequenz;
            }
        }
    }

    public boolean isEingeschaltet() {
        return eingeschaltet;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public double getFrequenz() {
        return frequenz;
    }
}
