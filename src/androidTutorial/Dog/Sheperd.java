package androidTutorial.Dog;

public class Sheperd extends Dog {
   
  int wings;

    
    
     Sheperd(String name, String color, int legs, boolean hasTale,int wings) {
        super(name, color, legs, hasTale);
        this.wings=wings;
        //TODO Auto-generated constructor stub
    }

    
     Sheperd() {
        this.setName("doggie");
        this.setColor("brown");
        this.setLegs(4);
        this.isHasTale(true);
        this.wings = 0;
    }

    public void getSheperd(){
        System.out.println("name: "+getName() +" color: "+getColor()+" legs: "+getLegs()+" legs: "+getHasTale()+" wings:"+wings);

    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }
}
