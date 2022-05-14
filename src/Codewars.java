import java.util.Arrays;

public class Codewars {
    public static String oddOrEven (int[] array) {
        // your code
        if (Arrays.stream(array).sum() % 2 == 0) {
            // shorter way than using a for or for/each loop
            return "even";
        }
        return "odd";
    }

    public static void main(String[] args) {
        oddOrEven(new int[] {3, 5, 34, 6});
    }
}
/*
"Best Practice" Solution: shadowmanos, TsaiYiTing, owo_BA, JennicaChu, invent, Кristian Jekov,
 IvanKotsovski, jorojoro, Lava Thalage, cyouffy (plus 14 more warriors)

import static java.util.Arrays.stream;

class Codewars {
    static String oddOrEven(final int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
 */