import java.util.ArrayList;
import java.util.List;

/**
 * @author Kaitlyn Gatineau
 *
 */
public class SquareDigit {
    // this solution is not the most efficient, after reviewing the better practices,
    // two loops are not needed to solve this kata.

    public static int squareDigits(int n) {
        List<Integer> intList = new ArrayList<>();
        int total = 0;
        while (n > 0) {
            // adds each digit of n to an Integer ArrayList
            intList.add(0, n % 10);
            n /= 10;
        }

        for (int i = 0; i < intList.size(); i++){
            if (i == 0 || intList.get(i) <= 3){
                // ensures no leading 0 when the index is 0, regardless if
                // the number is greater then 3.
                total = (10 * total) + intList.get(i) * intList.get(i);
            } else {
                // if number is greater than 3, the squared value will requre an extra digit
                // because 4 squared is 16 (two digits), etc.
                total = (100 * total) + intList.get(i) * intList.get(i);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        squareDigits(911911);
    }
}

/*
"Best Practice" Solution: laoris, owo_BA, AlexD1991, artgora, kristychu, BEagle,
huynd2210, Raji123, hmzklnc, hokkyar (plus 42 more warriors)
import java.util.stream.Collectors;

public class SquareDigit {

    public int squareDigits(int n) {
        return Integer.parseInt(String.valueOf(n)
                                      .chars()
                                      .map(i -> Integer.parseInt(String.valueOf((char) i)))
                                      .map(i -> i * i)
                                      .mapToObj(String::valueOf)
                                      .collect(Collectors.joining("")));
    }

}
 */