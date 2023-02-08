public class patterns {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 1; row <= 10; row++) {
            for (int col = 10; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 1; row < 10; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 10 - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int size = 10;
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col < row) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}












