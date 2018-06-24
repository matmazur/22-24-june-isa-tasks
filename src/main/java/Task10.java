import java.util.function.ToDoubleFunction;

public class Task10 {
    public static void main(String[] args) {

        Triangle t = new Triangle(5, 10);
        ToDoubleFunction<Triangle> f = triangle -> {
            triangle.setArea((0.5) * triangle.base * triangle.height);
            return triangle.getArea();
        };

        System.out.println(f.applyAsDouble(t));
        System.out.println(t.getArea());
    }
}