import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Kaitlyn Gatineau
 * Codewars Java - May 23rd
 */

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        return Arrays.stream(
                Arrays.stream(text.toLowerCase().split("")).toArray())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() > 1).map(Map.Entry::getKey).toList().size();
    }

   // public static void main(String[] args) {
   //     duplicateCount("abcde");
   // }
}