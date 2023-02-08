package Chapter8;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        String[] colors = new String[7];
        try {
            colors[0] = "Red";
            colors[1] = "Orange";
            colors[2] = "Blue";
            colors[3] = "pink";
            colors[4] = "Green";
            colors[5] = "Yellow";
            colors[6] = "Black";
            colors[7] = "purple";

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        for(int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
  //      }
  //      for (String color : colors) {
  //          System.out.println(color);
        }
        String colorArrays = Arrays.toString(colors);
        System.out.println(Arrays.toString(colors));
    }
}

