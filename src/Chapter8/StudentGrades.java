package Chapter8;

public class StudentGrades {
    public static void main(String[] args) {
        int [] grades = {77, 84, 64, 58, 23, 91, 34, 84, 74, 12};
        double total = 0;
        int min = grades [0];
        int max = grades [0];

        for (int counter = 0; counter < grades.length; counter++){
            total += grades[counter];
            if (grades[counter] < min){
                min = grades[counter];
            }
            if (grades[counter] > max) {
                max = grades[counter];
            }
        }
        double average = total/ grades.length;

        System.out.println("minimum grade is: " + min);
        System.out.println("minimum grade is: " + max);
        System.out.printf("students Grade average is %.2f%n", average);
    }

}
