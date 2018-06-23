import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class Task7 {

    public static void main(String[] args) {

        String s =  ".....\n" +
                ".....\n" +
                ".....\n" +
                ".....\n" +
                ".....\n" +
                ".....\n" +
                ".....\n" +
                ".....\n" +
                ".....\n" +
                ".....\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "X";
        System.out.println(findSpaceship(s));
    }
    public static String findSpaceship(String map) {

        String [] str = map.split("\n");
        String x="Spaceship lost forever!";

        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("X")){
                return "["+str[i].indexOf("X") + ", " + (str.length-i-1)+"]";
            }
            System.out.println();
        }
return x;
    }
}
