import java.util.*;

/**
 * @author Kaitlyn Gatineau
 * Codewars Java May 18th
 */
public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>(Arrays.stream(a).boxed().toList());
        list.removeAll(new ArrayList<>(Arrays.stream(b).boxed().toList()));
        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        arrayDiff(new int[] {1, 2, 3}, new int[] {1, 2});
    }
}

/*
"Best Practice" Solution:joecastle, Lagysha, user1231796, ignzio, Sasha123s, satish.bonde

import java.util.stream.IntStream;

public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
  }

}
 */