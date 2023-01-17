package Chapter4;

import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number: ");
        int number1 = scanner.nextInt();

        System.out.println("enter second number: ");
        int number2 = scanner.nextInt();

        System.out.println("sum  number1, number2");
        int sum = number1 + number2;
        System.out.println(sum);
    }
}
