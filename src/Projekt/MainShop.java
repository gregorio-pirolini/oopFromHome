package Projekt;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;




public class MainShop {

    Object o;

    Produkt p;

    static Scanner scanner = new Scanner(System.in);
    static String markeEg, modellEg;
    static double preisEg;

    static String farbeEg;
    static int zollEg;
    static String formFaktorEg;
    static Boolean wirelessEg;

 


    private static  ArrayList<Liste>onlineShop;
   
    
 
  
    public static void main(String[] args) {



        onlineShop = new ArrayList<>();
        
Maus maus1 = new Maus("markeEg", "modellEg", 0, "farbeEg");
Liste liste = new Liste("Maus",maus1);
onlineShop.add(liste);
        System.out.println( maus1.getDetails());
Monitor monitor1 = new Monitor("markeEg", "modellEg", 0, 4);
liste = new Liste("Monitor", monitor1);
onlineShop.add(liste);

Motherboard motherboard1 = new Motherboard("markeEg", "modellEg", 0, "formFaktorEg");
        liste = new Liste("Motherboard", motherboard1);
        onlineShop.add(liste);

Tastatur tastatur1 = new Tastatur("markeEg", "modellEg", 0, true);

        liste = new Liste("Tastatur", tastatur1);
        onlineShop.add(liste);




showShop();



        hauptMenue();
    }

    private static void showShop() {
        for (int i = 0; i<onlineShop.size(); i++ ){

            System.out.println("id: " + i +' '+ onlineShop.get(i).getDetails());
        }

    }

    public static void hauptMenue() {
        
        System.out.println("----------------------------------------------------");
        System.out.println("PC-Shop \t\t Hauptmenü \t\t von Greg Maleterre");
        System.out.println("----------------------------------------------------");
        System.out.println("1) Produkt anlegen");
        System.out.println("2) Produkt bearbeiten");
        System.out.println("3) Produkt suchen");
        System.out.println("4) Produkt löschen");
        System.out.println("0) shop beenden");
        System.out.println("----------------------------------------------------");
        System.out.println("Bitte wählen");

        String entry = scanner.next();
        switch (entry){
            case "1":
                System.out.println("Produkt anlegen!!");
                produktAnlegen();
                break;
            case "2":
                System.out.println("Produkt bearbeiten!!");
                produktBearbeiten();
                break;
            case "3":
                System.out.println("Produkt suchen!!");
                hauptMenue();
                break;
            case "4":
                System.out.println("Produkt löschen!!");
                hauptMenue();
                break;
            case "0":
                System.out.println("shop beenden!!");
                hauptMenue();
                break;
            default:
                System.out.println("Fehlerhafte Eingabe!!");
                hauptMenue();
        }

    }

    private static void produktBearbeiten() {

        boolean validation = false;

        while(!validation){
        System.out.println("----------------------------------------------------");
        System.out.println("PC-Shop \t\t Produkt bearbeiten \t\t von Greg Maleterre");
        System.out.println("----------------------------------------------------");

        showShop();

        System.out.println("exit \t\t --> \t\t hauptmenue";
        System.out.println("----------------------------------------------------");
        System.out.println("Bitte id oder exit wählen");



        String entry = scanner.next();
       if(entry.equals("exit")) {
           validation = true;
           hauptMenue();
       }else  {

           try{

              int num = scanner.nextInt();


               validation = true;
           } catch (InputMismatchException e) {
               System.out.println("Eingabe!!");
               scanner.next();
           }
       }


        }

    }

    private static void produktAnlegen() {

        boolean validation = false;
        String entry2;
        while(!validation)
        {
            System.out.println("----------------------------------------------------");
            System.out.println("PC-Shop \t\t Produkt anlegen \t\t von Greg Maleterre");
            System.out.println("----------------------------------------------------");
            System.out.println("1) Monitor");
            System.out.println("2) Motherboard");
            System.out.println("3) Tastatur");
            System.out.println("4) Mouse");
            System.out.println("----------------------------------------------------");
            System.out.println("Bitte wählen");

             entry2 = scanner.next();


            switch (entry2) {
                case "1":
                    System.out.println("Monitor!!");
                    validation = true;
                    enterInfo("Monitor");
                    break;
                case "2":
                    System.out.println("Motherboard!!");
                    validation = true;
                    enterInfo("Motherboard");
                    break;
                case "3":
                    System.out.println("Tastatur!!");
                    validation = true;
                    enterInfo("Tastatur");
                    break;
                case "4":
                    System.out.println("Mouse!!");
                    enterInfo("Mouse");

                    validation = true;
                    break;
                default:
                    System.out.println("Produkt anlegen Fehlerhafte Eingabe!!");
            }
        }
        
    }
        
  

    private static void enterInfo(String produkt) {


        boolean validation = false;
        String entryScanner;
        while (!validation) {
        System.out.println("enter marke");
        markeEg = scanner.next();
        validation = testValueString(markeEg);
        }
        
        validation = false;
        while (!validation) {
            System.out.println("enter modell");
            modellEg = scanner.next();
            validation = testValueString(modellEg);
        }

        validation = false;
        while (!validation) {
        System.out.println("enter preis");
        try {
            preisEg = scanner.nextDouble();
            validation = true;
        } catch (InputMismatchException e) {
            System.out.println("wrong preis");
            scanner.next();
            // statement inside the catch block to consume the invalid input. Here's the modified code:
        }
    }
         


 

         switch (produkt) {
            case "Monitor":
                // System.out.println("Monitor!!");
                validation = false;
                while (!validation) {
                
                System.out.println("enter zoll");
                try{

                    zollEg = scanner.nextInt();
                    Monitor monitorNew = new Monitor(markeEg, modellEg, preisEg, zollEg);
                   
                    

                   Liste liste = new Liste("Monitor", monitorNew);
                    onlineShop.add(liste);

                    validation = true;
                } catch (InputMismatchException e) {
                    System.out.println("Produkt anlegen Fehlerhafte Eingabe!!");
                    scanner.next();
                }
         
}
                break; 
            case "Motherboard":
                // System.out.println("Motherboard!!");
                validation = false;
                while (!validation) {
                    System.out.println("enter formFaktor");
                    formFaktorEg = scanner.next();
                    validation = testValueString(formFaktorEg);
                
                }
                Motherboard motherboardNew = new Motherboard(markeEg, modellEg, preisEg, formFaktorEg);
                 
             


                Liste liste = new Liste("Motherboard", motherboardNew);
                onlineShop.add(liste);
                break;

            case "Tastatur":// System.out.println("Tastatur!!");
            validation = false;
            while (!validation) {
                System.out.println("enter wireless yes/no");
            
                try{

                    wirelessEg = scanner.nextBoolean();
                    Tastatur tastaturNew = new Tastatur(markeEg, modellEg, preisEg, wirelessEg);
                   


                     liste = new Liste("Tastatur", tastaturNew);
                    onlineShop.add(liste);

                    validation = true;
                }  catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("Produkt anlegen Fehlerhafte Eingabe!!");
                }
           
            }
             
                break;
            case "Mouse":
                // System.out.println("Mouse!!");

                validation = false;

                while (!validation) {
                    System.out.println("enter Color");
                    farbeEg = scanner.next();
                    validation = testValueString(farbeEg);
                  
                }
                Maus mausNew = new Maus(markeEg, modellEg, preisEg, farbeEg);


                 liste = new Liste("Maus", mausNew);
                onlineShop.add(liste);


                break;


    }

    System.out.println("saved to file greg!!");


    validation = false;
    while(!validation){
        System.out.println("----------------------------------------------------");
        System.out.println("PC-Shop \t\t Produkt anlegen");
        System.out.println("----------------------------------------------------");
        System.out.println("1) neuen Produkt anlegen");
        System.out.println("2) Produkt bearbeiten");
        System.out.println("7) HauptMenue");
        System.out.println("----------------------------------------------------");
        System.out.println("Bitte wählen");

        entryScanner = scanner.next();


        switch (entryScanner) {
            case "1":
                System.out.println("neuen Produkt anlegen!!");
                validation = true;
                produktAnlegen();
                break;
            case "2":
                System.out.println("Produkt bearbeiten!!");
                validation = true;
                hauptMenue();
                break;
            case "7":
                System.out.println("HauptMenue!!");
                validation = true;
                hauptMenue();
                break;
            default:
             System.out.println("could not understand...");   
            }
        }
    }

    private static boolean testValueString(String testMe) {
        if (testMe.equals("")) {
            System.out.println("Produkt anlegen Fehlerhafte Eingabe!!");
            return false;
                }
        return true;
    }
}