package androidTutorial.challenge2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Contact> contacts;

    private static Scanner scanner;

    private static int id = 0;

    public static void main(String[] args) {
        /*
               * Simulate phone contact and message appl
               * 
        *Greet the user
              * show 3 optionss 1 manage contact 
                     * 2 message
                     * 3 quit
                     *       manage contact 
                     * 1 -> show all contacts
                     * 2 -> Add a new contact
                     * 3-> search for a new contact
                     * 4 -> delete a contact
                     * 5 -> back to menu
                     *          message
                            * 1 -> list of all messages
                     * 2 send  a new message
                     * 3 -> back to menu
        */
        contacts = new ArrayList<>();
        System.out.println("Programm is starting...");
        showInitialoptions();

    }

    private static void showInitialoptions() {
        System.out.println("\n\t1 manage contact \n\t2 message  \n\t3 quit");
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;

            default:
                break;
        }
    }

    private static void manageContacts() {
        System.out.println(
                "manageContacts\n\t1 -> show all contacts\n\t2 -> Add a new contact\n\t3-> search for a new contact\n\t4 -> delete a contact\n\t5 -> back to menu");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                searchForContact();
                break;

            case 4:
                DeleteContact();
                break;

            default:
                showInitialoptions();
                break;
        }
    }

    public static void showAllContacts() {
        System.out.println("show all contacts");
        for (Contact c : contacts) {
            c.getDetails();
            System.out.println("++++++++++++++++++++++");
        }

        showInitialoptions();
    }

    private static void addNewContact() {
        System.out.println("adding new Contact");
        System.out.println("enter name");
        String name = scanner.next();
        System.out.println("enter number");
        String number = scanner.next();
        System.out.println("enter email");
        String email = scanner.next();

        if (name.equals("") || number.equals("") || email.equals("")) {
            System.out.println("enter all infos");
            addNewContact();
        } else {
            boolean doesExist = false;
            for (Contact c : contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
                

            }
            if (doesExist) {
                System.out.println(name + " is already on the list");
                addNewContact();
            } else {
                Contact contact = new Contact(name, number, email);
                contacts.add(contact);
                System.out.println(name + " added succesfully");
            }
           
        }
        showInitialoptions();
    }

    private static void DeleteContact() {

        System.out.println("enter contact name");
        String name = scanner.next();

        if (name.equals("")) {
            System.out.println("cannot be empty");
            DeleteContact();
        } else {
            boolean doesExist   = false;
            for (Contact c : contacts) {
                if (c.getName().equals(name)) {
                    doesExist   = true;
                    contacts.remove(c);

                 
                }
            }
            if(!doesExist){  System.out.println("no contacts");}
        
        
    }
    showInitialoptions();
    }

    private static void searchForContact() {
        System.out.println("enter contact name");
        String name = scanner.next();

        if (name.equals("")) {
            System.out.println("cannot be empty");
            searchForContact();
        } else {
            boolean doesExist = false;
            for (Contact c : contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    c.getDetails();

                }

            }

            if(!doesExist){  System.out.println("no contacts 1");}
        }
    showInitialoptions();
    }
    private static void manageMessages() {
        System.out.println(
                "manageMessages \n\t1 -> list of all messages\n\t2 -> send  a new message\n\t3-> back to menu");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllMessages();
                break;
            case 2:
                sendNewMessages();
                break;
            default:
                showInitialoptions();
                break;
        }
        // 1 -> list of all messages
        // * 2 send  a new message
        // * 3 -> back to menu

    }

    private static void sendNewMessages() {
        System.out.println("send to message to who?");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("please enter name of the contact");
            sendNewMessages();
        } else {
            boolean doesExist = false;
            for (Contact c : contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }

            }

            if (doesExist) {
                System.out.println("enter your message");
                String text = scanner.next();
                if (text.equals("")) {
                    System.out.println("message cannot be empty");
                    sendNewMessages();
                }else{
                    id++;
                    Message newMessage = new Message(text, name, id);
                    for (Contact c : contacts) {
                        if (c.getName().equals(name)) {
                            ArrayList<Message> newMessages = c.getMessages();
                            newMessages.add(newMessage);
                            c.setMessages(newMessages);
                           
                        }

                    }
                }
            } else {
               System.out.println("user not found"); 

            }
        }
showInitialoptions();
    }

    private static void showAllMessages() {
        ArrayList<Message> allMessages = new ArrayList<>();
        for (Contact c : contacts) {
            allMessages.addAll(c.getMessages());
        }
        if (allMessages.size() > 0) {
            for (Message m : allMessages) {
                m.getDetails();
            }
            }
            else{
                System.out.println("there is no messages");
            }
            showInitialoptions();
        }
    

}