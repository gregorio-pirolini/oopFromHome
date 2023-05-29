package androidTutorial.inter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ElectricCar carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(500);
        

        FossilCar carInterface2 = new FossilCar("Tesla");
        carInterface2.start();
        carInterface2.move(500);
    }
}
