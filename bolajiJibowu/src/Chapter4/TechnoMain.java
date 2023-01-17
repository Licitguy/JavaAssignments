package Chapter4;

import java.util.Scanner;

public class TechnoMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Techno techno = new Techno();
        System.out.println(techno.displayMenu());

        techno.userSelection();

        System.out.println("Do you wish to continue? yes/no");
        String userChoice = input.next();

        do {
            if (userChoice.equalsIgnoreCase("yes")) {
                System.out.println(techno.displayMenu());
                techno.userSelection();
                System.out.println("Do you wish to continue? Yes/no");
                userChoice = input.next();
            } else {
                techno.displayMenu();
            }
        } while(userChoice.equalsIgnoreCase("yes"));
    }


}