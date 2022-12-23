
import java.util.Scanner;

    public class BodyMassIndex {
     private static double weight;
       private static double height;
       private static int pounds;


        public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double userInput = input.nextDouble();
        double bmi = weight*703/(height * height);
        System.out.printf("your bmi is %.2f%n", bmi);
        if (userInput < 18.5) {
            System.out.println("is underweight");
        }
        if(userInput > 30){
            System.out.println("is obesity");
        }
    }
}






