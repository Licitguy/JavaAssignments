package nokia;

import java.util.Scanner;

public class Nokia {
    Scanner scanner = new Scanner(System.in);
    public void displayMenu() {
        System.out.println("""
                welcome!!!
                Enter 1 --> for phonebook
                2 --> for Message 
                3 --> for Call register
                4 --> for Settings
                5 --> for Games 
                6 --> for Extras
                """);
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            phoneBook();
        }
        if (userInput == 2) {
            messageMenu();
        }
        if (userInput == 3) {
            callRegisterMenu();
        }
        if (userInput == 4) {
            settingsMenu();
        }
        if (userInput == 5) {
            gamesMenu();
        }
        if (userInput == 6) {
            extraMenu();
        } else if (userInput == -1) {
            System.out.println("Thank you!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        }
    }

    public void phoneBook() {
        System.out.println("""
                1 --> Contact
                2 --> Add contact
                3 --> Edit contact
                0 --> main menu
                """
        );
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 0:
                displayMenu();
        }
    }

    public void messageMenu() {
        System.out.println("""
                1 --> Create message
                2 --> Inbox
                3 --> Outbox
                4 -->Draft
                0 --> main menu
                """);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 0: displayMenu();
            break;
            case 2: inboxMenu();
        }

    }

    private void inboxMenu() {
        System.out.println("""
                message
                enter 0 for main menu
                enter -1 for quit
                """);
        int userInput= scanner.nextInt();
        switch (userInput){
            case 0: displayMenu();
            break;
            case -1: System.out.println("Thank you!");


        }
    }

    public void callRegisterMenu() {
        System.out.println("""
                1 --> Dialed calls
                2 --> Missed calls
                3 --> Received calls
                0 --> main menu            
                """);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 0:
                displayMenu();
        }
    }

    public void settingsMenu() {
        System.out.println("""
                1 --> Tone settings
                2 --> Call settings
                3 --> Phone settings
                0 --> main menu
                """);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 0:
                displayMenu();
        }
    }


    public void gamesMenu() {
        System.out.println("""
                  1 --> Snake
                  2 --> Bounce
                  0 --> main menu
                """);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 0:
                displayMenu();
        }
    }

    public void extraMenu() {
        System.out.println("""
                1 --> Alarm
                2 --> Calender
                3 --> Time and Date
                0 --> main menu
                """);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 0:
                displayMenu();
        }
    }
}
//public void mainMenu() {
//        int userInput = scanner.nextInt();
//        switch (userInput) {
//            case 1:
//                phoneBook();
//                break;
//            case 2:
//                messageMenu();
//                break;
//            case 3:
//                callRegisterMenu();
//                break;
//            case 4:
//                settingsMenu();
//                break;
//            case 5:
//                gamesMenu();
//                break;
//            case 6:
//                extraMenu();
//                break;
//            default:
//                System.out.println("Invalid Input");
//                break;
//        }
//
//
//            String userChoice;
//
//            System.out.println("Do you wish to continue? yes/no");
//            userChoice = scanner.next();
//            if (userChoice.equalsIgnoreCase("yes")){
//                displayMenu();
//            }
//
//
//
//
//    }
//}
