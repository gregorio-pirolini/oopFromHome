package Projekt;

public class Produkt {
    private String marke;
    private String modell;
    private Double preis;

    public Produkt(String marke, String modell, Double preis) {
        this.marke = marke;
        this.modell = modell;
        this.preis = preis;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public Double getPreis() {
        return preis;
    }

    public void setPreis(Double preis) {
        this.preis = preis;
    }

   
    public String getDetails() {
        // TODO Auto-generated method stub
       
        return "Marke: " + marke + ", Modell: " +modell+", Preis: " +preis;
    }

}