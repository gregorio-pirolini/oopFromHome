package androidTutorial.Phone;

public class Main{

   public static void main(String[] args) {
       System.out.println("hello word");
    
       Phone tel = new Phone();
       Phone tel2= new Phone(); 
    tel.playMusic("track Name");
    tel.setName("fone");
    tel.getPhone();
    tel2.getPhone();
   }
}