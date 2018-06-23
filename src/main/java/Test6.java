import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {



        ArrayList<String> santasList = new ArrayList<String>();
        ArrayList<String> children = new ArrayList<String>();
        for(String s : new String[] {"Jason", "Jackson", "Jordan", "Johnny","JAsoN", "jASon"})
            santasList.add(s);
        for(String s : new String[] {"Jason", "Jordan", "Jennifer"})
            children.add(s);



        ArrayList<String> goodChildren = (ArrayList<String>) findChildren(santasList,children);

        goodChildren.forEach(System.out::println);


    }
    public static List<String> findChildren(List<String> santasList, List<String> children) {

        List <String> entryList=new ArrayList<>();

        santasList.sort(String::compareTo);
        children.sort(String::compareTo);

        for (String s:santasList){
            for (String c:children){
                if (s.equals(c)){
                    entryList.add(s);
                    break;
                }
            }
        }
        return entryList.stream().distinct().collect(Collectors.toList());
    }
}
