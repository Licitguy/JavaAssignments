import Chapter8.Hotel;


import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hotel hotel = new Hotel(10);
        System.out.println(hotel.displayHotelMenu());
        hotel.userSelection();

        System.out.println("Do you wish to continue? yes/no");
        String userChoice = input.next();

        do {
            if (userChoice.equalsIgnoreCase("yes")) {
                System.out.println(hotel.displayHotelMenu());
                hotel.userSelection();
                System.out.println("Do you wish to continue? Yes/no");
                userChoice = input.next();
            } else {
                hotel.displayHotelMenu();
            }
        } while(userChoice.equalsIgnoreCase("yes"));

        System.out.println("Thank you");
    }
}