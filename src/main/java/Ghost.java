import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Ghost {

    private final String color;
    List<String> colours = Arrays.asList("white", "yellow", "purple", "red");

    public Ghost() {
        Random random = new Random();
        color = colours.get(new Random().nextInt(colours.size()));
    }

    public String getColor(){
        return this.color;
    }
}