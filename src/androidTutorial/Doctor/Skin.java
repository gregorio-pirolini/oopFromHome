package androidTutorial.Doctor;

public class Skin extends Organ {
    private String color;
    private int softness; // 0 to 100




    public Skin(String name, String medicalCondition, String color, int softness) {
        
        super(name,medicalCondition);
        this.color = color;
        this.softness = softness;
    }
 

    @Override
    public void getDetails() {
        // TODO Auto-generated method stub
        super.getDetails();
        System.out.println("color: "+color+"softness: "+softness);
    }
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return this.softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }

}
