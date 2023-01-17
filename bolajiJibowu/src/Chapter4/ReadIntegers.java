package Chapter4;

import java.security.SecureRandom;

public class ReadIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int face = 0;

        for (int counter = 1; counter <= 10; counter++) {
            face = randomNumbers.nextInt(10);

            System.out.printf("%d ", face);

            if (counter % 5 == 0) {

                System.out.println();
            }

        }
    }
}