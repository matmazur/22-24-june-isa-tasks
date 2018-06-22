import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };


        inArray(a,b);

    }

    public static String[] inArray(String[] array1, String[] array2) {

        List<String> temp = new ArrayList<>();
        Arrays.sort(array1);
        Arrays.sort(array2);

        for (String anArray1 : array1) {
            for (String anArray2 : array2) {

                if (anArray2.contains(anArray1)) {
                    temp.add(anArray1);
                    break;
                }
            }
        }
        String [] r = new String [temp.size()];
        r=temp.toArray(r);

        return r;
    }
}
