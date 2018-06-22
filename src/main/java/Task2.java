import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {


        int[] nums = new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};

        System.out.println(findIt(nums));
    }

    public static int findIt(int[] a) {

        Map<Integer, Integer> odd = new HashMap<>();

        for (int i : a) {
            if (!odd.containsKey(i)) {
                odd.put(i, 1);
            } else {
                odd.put(i, odd.get(i) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> map : odd.entrySet()) {
            if (map.getValue() % 2 != 0) {
                return map.getKey();
            }
        }
        return 0;
    }
}