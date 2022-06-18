import java.util.*;
import java.util.stream.Collectors;

public class Permutations {
    public static List<String> singlePermutations(String s) {
        List<String> list = new ArrayList<String>();
        List<Character> word = new LinkedList<>(s.chars().mapToObj((i) -> (char) i).toList());

        try {
            int i = 0;
         //   list.add(word);
            while (i < 20) {
                Collections.shuffle(word);
                    list.add(word.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining()));
                    System.out.println(list);
                    i++;
            }
           // }

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Null");
        }

        return null;
    }
    /*
    public static void main(String[] args) {
    singlePermutations("test");
    } */
}
