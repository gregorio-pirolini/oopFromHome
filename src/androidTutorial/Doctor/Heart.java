package androidTutorial.Doctor;

public class Heart extends Organ {
    private int rate;

    
    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }

    public void getDetails(){
        super.getDetails();
System.out.println("rate: "+rate);
    }

    public int getRate() {
        return this.rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }


   

 

    

}
