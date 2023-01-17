package Chapter4;

import java.util.Scanner;

public class Techno {


        static Scanner input = new Scanner(System.in);


    public String displayMenu() {
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
                       1 -> Contacts
                       2 -> Blacklist
                       3 -> Speed dial
                       """);
           }
           public static void messageMenu() {
               System.out.println("""
                       1 -> Create message
                       2 -> Inbox
                       3 -> Outbox
                       4 -> Draft
                       """);
           }
           public static void callRegisterMenu() {
               System.out.println("""
                       1 -> Dialed calls
                       2 -> Missed calls
                       3 -> Received calls 
                       """);
           }
           public static void settingsMenu() {
               System.out.println("""
                       1 -> Tone settings
                       2 -> Display
                       3 -> Received
                       """);
           }
           public static void gamesMenu() {
               System.out.println("""
                       1 -> Snake
                       2 -> Bounce                 
                       """);
           }
           public static void extraMenu() {
               System.out.println("""
                       1 -> Calender
                       2 -> Calculator
                       3 -> Alarm
                       """);
           }
           public void userSelection(){
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


    }
