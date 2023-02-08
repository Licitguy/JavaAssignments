import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractise {
    public static void main(String[] args) {
        String[] colors = new String[7];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "pink";
        colors[4] = "Green";
        colors[5] = "Yellow";
        colors[6] = "Black";


        for(String color : colors){
            System.out.println(color);
        }
//        String colourArrays = Arrays.toString(colors);
 //       System.out.println(Arrays.toString(colors));

//        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
//        for (int i = 0; i < colors.length; i++) {
//           System.out.println(colors[i]);


        }
    }


