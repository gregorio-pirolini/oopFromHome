package androidTutorial.Dog;

public class Animal {
    private String name;
    private String color;
    private int legs;
    private boolean hasTale;


    Animal(String name, String color, int legs, boolean hasTale) {

        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTale = hasTale;

    }
    
    Animal()
    {
        this.name = "name";
        this.color = "pink";
        this.legs = 4;
        this.hasTale = true;
    }

    public void eat(String food) {
        System.out.println("eats: " + food);
        }


    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void isHasTale(boolean hasTale){
        this.hasTale = hasTale;
    }

    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getLegs() {
        return legs;
    }

    public boolean getHasTale() {
        return hasTale;
    }

}