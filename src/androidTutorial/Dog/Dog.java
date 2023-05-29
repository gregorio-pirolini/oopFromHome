package androidTutorial.Dog;

public class Dog extends Animal {
    
    public Dog(String name, String color, int legs, boolean hasTale) {
        super(name, color, legs, hasTale);

    }
    Dog() {
        this.setName("Birdito");
        this.setColor("Yellow");
        this.setLegs(2);
        this.isHasTale(true);
        
    }
}
