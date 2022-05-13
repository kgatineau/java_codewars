import java.util.Locale;

/**
 * @author Kaitlyn Gatineau
 * Codewars Java - May 12th 2022
 */
public class Pangram {
    public static boolean check(String sentence) {
        char[] letters = "abcdefghijklmnopqrstuvwxyz"
                .toCharArray();
        for (char letter : letters){
            if (!sentence.toLowerCase(Locale.ROOT)
                    .contains(String.valueOf(letter))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        check("abf");
    }
}

/*
"Best Practice" solution: aei1967, Dadaji, Ja67, Ruslan Havrylenko, cristhianp, APRobertson,
Jhon Huamani, Udiane, Turi-byte, HotCurry (plus 72 more warriors)

public class PangramChecker {
  public boolean check(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

  }
}
 */