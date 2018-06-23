import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Robot {

    private List<String> wordsLearned;

    public Robot() {

        String[] s1 = ("Thank you for teaching me " +
                "I already know the word " +
                "do not understand the input").split(" ");

        wordsLearned = new ArrayList<>(Arrays.asList(s1));
    }
    public String learnWord(String word) {
        if (!word.matches("[a-zA-Z]+")) {
            return "I do not understand the input";
        }
        boolean is = false;
        for (String s : wordsLearned) {
            if (word.equalsIgnoreCase(s)) {
                return "I already know the word " + word;
            }
        }

        wordsLearned.add(word);
        return "Thank you for teaching me " + word;
    }

    public List<String> getWordsLearned() {
        return wordsLearned;
    }
}
