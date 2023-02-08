public class ArrayClass {
    public static void main(String[] args) {
        int[] numbers = {2, 8, 8, 1, 5, 2, 1, 3};

//        for (int i = 1; i < numbers.length; i++) {
//            if (i % 2 == 1) {
//                System.out.println(numbers[i]);
        int count = 0;
        for (int number : numbers) {
            boolean countIsOdd = count % 2 != 0;
            if (countIsOdd) System.out.println(number);
            count++;
        }
            }
        }




