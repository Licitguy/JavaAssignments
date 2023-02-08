package Chapter8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        String age = scanner.nextLine();
        System.out.println("What's your favourite food? ");
        String food = scanner.nextLine();
        System.out.println("Hello "+name);
        System.out.println("you are "+age+" years old");
        System.out.println("You like "+food);

    }
}
