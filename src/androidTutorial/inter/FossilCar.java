package androidTutorial.inter;

public class FossilCar implements CarInterface {

    private String name;

    FossilCar(String name) {
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
System.out.println("fire is starting");

    }

    @Override
    public void move(int speed) {
        // TODO Auto-generated method stub
        System.out.println(this.getName() + "is moving at: " + speed + "mph");


    }

    
}
