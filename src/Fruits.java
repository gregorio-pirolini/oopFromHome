public class Fruits{
   
     String name;
     int many;
     double weight;

     //constructor
      Fruits(String name, int many, double weight) {
          this.name = name;
          this.many = many;
          this.weight = weight;
     }

     Fruits() {
          this.name = "name";
          this.many = 13;
          this.weight = 3.5;
     }

    // Fruits("name", 13, 12.56);

     public void getFruits() {
          System.out.println("name: "+name +" many: "+many+" weight: "+weight );
     }
      

     //getter
     public String getName() {
          return name;

     }

     public int getMany() {
          return many;
     }

     public double getWeight() {
          return weight;
     }
     //setter

     public void setName(String name) {
          this.name = name;
     }

     public void setMany(int many) {
          this.many=many;
     }
     
     public void setWeight(double weight) {
          this.weight = weight;  
     }



}