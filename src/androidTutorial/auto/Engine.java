package androidTutorial.auto;
public class Engine {
    
    private String model;
    private int rpm;


    // konstructor

    public Engine(String model, int rpm) {
        this.model = model;
        this.rpm = rpm;

    }
    // default 
    public Engine() {
        this.model = "model name";
        this.rpm = 120;

    }
    
    public void getEngine() {
        System.out.println("model: "+model+" rpm: "+rpm);
    } //setter

    public void setModel(String model) {
        this.model = model;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    //getter
    public String getModel() {
        return model;
    }
    
        public int getRpm() {
            return rpm; }
}
