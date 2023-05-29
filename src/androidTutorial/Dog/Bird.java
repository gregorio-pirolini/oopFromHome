package androidTutorial.Dog;


public class Bird extends Animal {
    private int wings;



    public Bird(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        this.wings = wings;
    }
    
    Bird() {
        this.setName("Birdito");
        this.setColor("Yellow");
        this.setLegs(2);
        this.isHasTale(true);
        this.wings = 2;
    }
    
    public void getBird(){
        System.out.println("name: "+getName() +" color: "+getColor()+" legs: "+getLegs()+" legs: "+getHasTale()+" wings:"+wings );
    }


    public void fly() {
        System.out.println(this.getName() + " flyes");

    }
    
    public void eat(String food) {
        super.eat(food);
        System.out.println("eating finished");
        }
    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }
}
