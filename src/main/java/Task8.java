public class Task8 {

    public static void main(String[] args) {

        Robot ivy = new Robot() ;

        System.out.println(ivy.learnWord("ayahuasca"));
        System.out.println(ivy.learnWord("ayahuasca"));
        System.out.println(ivy.learnWord("hello"));
        System.out.println(ivy.learnWord("hello"));
        System.out.println(ivy.learnWord("me"));
        System.out.println(ivy.learnWord("mE"));
        System.out.println(ivy.learnWord("Me"));
        System.out.println(ivy.getWordsLearned());
    }
}
