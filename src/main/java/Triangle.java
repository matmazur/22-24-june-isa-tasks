public class Triangle {

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public final int height;
    public final int base;
    private double area;
    public void setArea(double a) {
        area = a;
    }
    public double getArea() {
        return area;
    }
}