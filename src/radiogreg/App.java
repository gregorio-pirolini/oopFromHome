package radiogreg;



public class App {


    public static void main(String[] args) {
        System.out.println("programm starting");

        RadioGreg r = new RadioGreg();
        r.an();
        r.setLoud(80);
        r.setFqz(180.0);
        r.getRadioGreg();
        r.lauter();
        r.getRadioGreg();
    }
}
