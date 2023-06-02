package radio0;

public class Main {
    public static void main(String[] args) {
        Radio r1 = new Radio();
        System.out.println(r1.toString());
//        r1.an();
        System.out.println(r1.toString());
        r1.lauter();
        System.out.println(r1.toString());
        r1.waehleSender(122.4);
        System.out.println(r1.toString());
        r1.waehleSender(91.4);
        System.out.println(r1.toString());
    }
}