package androidTutorial.inter;

public class ElectricCar implements CarInterface {
 
    private String name;



    public ElectricCar(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println(this);
        System.out.println("electricity flow started...");
    }

    @Override
    public void move(int speed) {
        // TODO Auto-generated method stub
        System.out.println(this.getName()+ "is moving at:  "+ speed +"mph");
        
    }
    
}
