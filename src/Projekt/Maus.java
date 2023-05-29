package Projekt;

public class Maus extends Produkt{

    private String farbe;

    public Maus(String marke, String modell, double preis, String farbe) {
        super(marke, modell, preis);
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }


    @Override
    public String getDetails() {
        // TODO Auto-generated method stub
        String details=super.getDetails();
        return details+" farbe: "+farbe ;
    }
    
}