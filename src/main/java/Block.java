public class Block {

    private int width;
    private int length;
    private int height;
    private int volume;
    private int surfaceArea;


    public Block(int[] arr) {
        width = arr[0];
        length = arr[1];
        height = arr[2];
        volume = width * length * height;
        surfaceArea = (2 * length * height) + (2 * length * width) + (2 * width * height);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return volume;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }
}