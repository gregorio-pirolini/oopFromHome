package radiogreg;

public class RadioGreg {
    
    //    on off
    private boolean istAn;
    //    loud 0 -10
    private int loud;
    //    fqz 85.00 110.00
    private double fqz;

    // konstructor


    public RadioGreg(boolean istAn, int loud, double fqz) {
        this.istAn = istAn;
     if(loud<0||loud>10){loud=5;}
        this.loud = loud;
        this.fqz = tune(fqz);
        
    } 
    //default values
    public RadioGreg() {
        this.istAn = true;
        this.loud = 5;
        this.fqz = 100;

    }
    
    public void getRadioGreg() {
    System.out.println("getRadioGreg on: "+istAn+" loud: " +loud+ " fqz: "+fqz);
    }
    public String toString() {
        return  "toString on: "+istAn+" loud: " +loud+ " fqz: "+fqz;
        }
    // setter


    public void setIstAn(boolean istAn) {
        this.istAn = istAn;
    }


    public void setLoud(int loud) {
        if(loud<0||loud>10){loud=5;}
        this.loud = loud;

    }
    
    public void setFqz(Double fqz) {
        this.fqz=tune(fqz);
        
    }
    //getter

    public boolean getIstAn() {
        return istAn;
    }


    public int getLoud() {
        return loud;

    }
    
    public double getFqz() {
        return fqz;
        
    }

    public void lauter() {
        if (this.istAn) {
            this.loud++;
        }
        toString();
    }
    
    public void leiser(){
        if (this.istAn) {
            this.loud--;
        }
        toString();
    }
        public void an() {
           
                istAn=true;
           
        }
        
        public void aus(){
            istAn=false;
    }

    public double tune(double fqz) {
        double fqzSet;
        if (fqz < 85 || fqz > 110) {
            fqzSet = 99.9;
        } else {
            fqzSet = fqz;
        }
        return fqzSet;
    }
  
}
