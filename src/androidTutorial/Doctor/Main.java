package androidTutorial.Doctor;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Brad", 28,
                new Eye("left eye", "short sighted", "blue", true),
                new Eye("right eye", "normal", "blue", true), new Heart("Heart", "normal", 65),
                new Stomach("stomach", "PUD", false),
                new Skin("skin", "burned", "white", 40));
        System.out.println("name: " + patient.getName());
        System.out.println("age: " + patient.getAge());
                
        Scanner scanner = new Scanner(System.in);
        boolean shouldFinish = false;

        while (!shouldFinish) {
        System.out.println("choose an Organ" +
        "\n\t1. Left eye" +
        "\n\t2. Right eye" +
        "\n\t3. Heart" +
        "\n\t4. Stomach" +
        "\n\t5. Skin" +
        "\n\t6. Quit" 
        );

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                patient.getLeftEye().getDetails();
                if (patient.getLeftEye().getIsOpened()) {
                    System.out.println("\t\t1. Close the eye");
                    if (scanner.nextInt() == 1) {
                patient.getLeftEye().close();
            } else {
                continue;
            }
        } else {
            System.out.println("\t\t1. Open the eye");
            if (scanner.nextInt() == 1) {
                patient.getLeftEye().open();
            } else {
                continue;
            }

        }
        break;
        case 2:
        patient.getRightEye().getDetails();
        if (patient.getRightEye().getIsOpened()) {
            System.out.println("\t\t1. Close the eye");
            if (scanner.nextInt() == 1) {
        patient.getRightEye().close();
    } else {
        continue;
    }
} else {
    System.out.println("\t\t1. Open the eye");
    if (scanner.nextInt() == 1) {
        patient.getRightEye().open();
    } else {
        continue;
    }

}
break;
case 3:
    patient.getHeart().getDetails();
    System.out.println("\t\t1. change heart rate");
    if (scanner.nextInt() == 1) {
        System.out.println("enter new heart rate");
        int heartRate = scanner.nextInt();
        patient.getHeart().setRate(heartRate);
        System.out.println("patient heart Rate chanegd to: "+patient.getHeart().getRate());
    } else {
        continue;
    }
        
    break;
case 4:
    patient.getStomach().getDetails();
    System.out.println("\t\t1. Digest");
    if (scanner.nextInt() == 1) {
    patient.getStomach().digest();
} else {
    continue;
}
break;
case 5:
    patient.getSkin().getDetails();
    break;
default:
    shouldFinish = true;

        }//end of switch
        }
        
    }

}
