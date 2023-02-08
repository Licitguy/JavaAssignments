package Chapter8;

import java.util.Scanner;

public class Bontel {

    static Scanner input = new Scanner(System.in);


    public static String displayMenu() {
        return """
                     Welcome!!!
                     Enter 1 -> for phonebook
                     2 -> for Message
                     3 -> for Call register
                     4 -> for settings
                     5 -> for Games
                     6 -> Extras
                     """;
    }
    public static void phonebookMenu() {
        System.out.println("""
                        Contacts
                        Blacklist
                        Speed dial
                       """);
    }
    public static void messageMenu() {
        System.out.println("""
                        Create message
                        Inbox
                        Outbox
                        Draft
                       """);
    }
    public static void callRegisterMenu() {
        System.out.println("""
                        Dialed calls
                        Missed calls
                        Received calls 
                       """);
    }
    public static void settingsMenu() {
        System.out.println("""
                        Tone settings
                        Display
                        Received
                       """);
    }
    public static void gamesMenu() {
        System.out.println("""
                        Snake
                        Bounce                 
                       """);
    }
    public static void extraMenu() {
        System.out.println("""
                        Calender
                        Calculator
                        Alarm
                       """);
    }
    public static void userSelection(){
        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
                phonebookMenu();
                break;
            case 2:
                messageMenu();
                break;
            case 3:
                callRegisterMenu();
                break;
            case 4:
                settingsMenu();
                break;
            case 5:
                gamesMenu();
                break;
            case 6:
                extraMenu();
                break;
            default:
                System.out.println("Invalid Input!!! please input a digit within the range of 1 to 6");
                break;
        }
    }
    public static void decideUserInput(){

        System.out.println("Do you wish to continue? yes/no");
        String userChoice = input.next();

        while(userChoice.equalsIgnoreCase("yes")){
            System.out.println(Bontel.displayMenu());
            Bontel.userSelection();
            System.out.println("Do you wish to continue? yes/no");
            userChoice = input.next();
        }
        System.out.println("Thank you");
    }
    }





