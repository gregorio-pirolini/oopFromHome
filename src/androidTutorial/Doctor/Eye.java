package androidTutorial.Doctor;


public class Eye extends Organ {
    
    private String color;
    private boolean isOpened;



    public Eye(String name, String medicalCondition,String color, boolean isOpened) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("color " + color+" isOpened:  " + isOpened);
    }
    
    public void open() {
        setIsOpened(true);
        System.out.println(getName()+ " is opened");
    }
    public void close() {
        setIsOpened(false);
        System.out.println(getName()+ " is closed");
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsOpened(Boolean isOpened) {
        this.isOpened = isOpened;
    }
    public boolean getIsOpened() {
        return this.isOpened;
    }

  


    
}
