import java.util.function.IntUnaryOperator;

public class Task11 {

    public static void main(String[] args) {
        System.out.println(create(5).applyAsInt(-1));
    }

    public static IntUnaryOperator create(int addTo) {

        return p -> addTo + p;
    }
}
