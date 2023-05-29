package androidTutorial.auto;

public class Car {
    
    private String name;
    private int doors;
    private String color;
    private Engine engine;

    // konstuctor
    public Car(String name, int doors, String color, Engine engine) {
        this.name = name;
        this.doors = doors;
        this.color = color;
        this.engine = engine;

    }
    public Car( ) {
        this.name = "name";
        this.doors = 666;
        this.color = "color";
        this.engine = new Engine();

    }
    public void getCar() {
        System.out.println( "name: "+ name+", doors: "+ doors+", color: "+ color +", engine: "+ getEngine());
    }


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the doors
     */
    public int getDoors() {
        return doors;
    }

    /**
     * @param doors the doors to set
     */
    public void setDoors(int doors) {
        this.doors = doors;
    }

    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return Engine return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
