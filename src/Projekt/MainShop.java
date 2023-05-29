package Projekt;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MainShop {

    static Scanner scanner = new Scanner(System.in);
    static String markeEg, modellEg;
    static double preisEg;

    static String farbeEg;
    static int zollEg;
    static String formFaktorEg;
    static Boolean wirelessEg;

 

    private static Map<String, Maus>mausMap;
    private static Map<String, Monitor>monitorMap;
    private static Map<String, Motherboard>motherboardMap;
    private static Map<String, Tastatur>tastaturMap;
    private static  ArrayList<Map>onlineShop; 
   
    
 
  
    public static void main(String[] args) {

        mausMap = new HashMap<>();
        monitorMap =new HashMap<>();
        motherboardMap = new HashMap<>();
        tastaturMap = new HashMap<>();

        onlineShop = new ArrayList<>();
        
Maus maus1 = new Maus("markeEg", "modellEg", 0, "farbeEg");
mausMap.put("Maus", maus1);
onlineShop.add(mausMap);

Monitor monitor1 = new Monitor("markeEg", "modellEg", 0, 4);
monitorMap.put("Monitor", monitor1);
onlineShop.add(monitorMap);

Motherboard motherboard1 = new Motherboard("markeEg", "modellEg", 0, "formFaktorEg");
motherboardMap.put("Monitor", motherboard1);
onlineShop.add(motherboardMap);

Tastatur tastatur1 = new Tastatur("markeEg", "modellEg", 0, true);

tastaturMap.put("Tastatur", tastatur1);
onlineShop.add(tastaturMap);

for (Map<String, Object> item : onlineShop) {
    for (Map.Entry<String, Object> entry : item.entrySet()) {
        String key = entry.getKey();
        Object value = entry.getValue();
        System.out.println("Key: " + key + ", Value: " + value);
    } }
        hauptMenue();
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
        System.out.println("----------------------------------------------------");
        System.out.println("PC-Shop \t\t Produkt bearbeiten \t\t von Greg Maleterre");
        System.out.println("----------------------------------------------------");


        System.out.println("1) Monitor");
        System.out.println("2) Motherboard");
        System.out.println("3) Tastatur");
        System.out.println("4) Mouse");


        System.out.println("----------------------------------------------------");
        System.out.println("Bitte wählen");

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
                   
                    
                    monitorMap.put("Monitor", monitorNew);
                    
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
                 
             
                motherboardMap.put("Motherboard", motherboardNew);
                break;

            case "Tastatur":// System.out.println("Tastatur!!");
            validation = false;
            while (!validation) {
                System.out.println("enter wireless yes/no");
            
                try{

                    wirelessEg = scanner.nextBoolean();
                    Tastatur tastaturNew = new Tastatur(markeEg, modellEg, preisEg, wirelessEg);
                   
                    tastaturMap.put("Tastatur", tastaturNew);
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
                
                mausMap.put("Maus", mausNew);
                break;


    }

    System.out.println("saved to file greg!!");


    validation = false;
    while(!validation){
        System.out.println("----------------------------------------------------");
        System.out.println("PC-Shop \t\t Produkt anlegen");
        System.out.println("----------------------------------------------------");
        System.out.println("1) neuen Produkt anlegen");
        System.out.println("2) HauptMenue");
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