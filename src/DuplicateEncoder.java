/**
 * @author Kaitlyn Gatineau
 * Coddewars Java - May 17th
 *
 */
public class DuplicateEncoder {
    static String encode(String word) {

        StringBuilder sb = new StringBuilder();
        // StringBuilder used to create the new String
        for (int i = 0; i < word.length(); i++){
            int j = i; // lambda expression required "final" or "effectively final" temp variable
            long count = word.toLowerCase().chars()
                    .filter(ch -> ch == word.toLowerCase().charAt(j)).count();
            // counts the occurences of the character of the given index (i value in the loop)
            if (count > 1){
                sb.append(')');
            } else {
                sb.append('(');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        encode("Prespecialized");
    }
}

/*
"Best Practice" Solution: mortonfox, Clarisa, Jefff, Vinceng63, JamesHullCS, Korellas,
hrhuynguyen, MichaeT, CircuitSword, devindrapper12 (plus 18 more warriors)

public class DuplicateEncoder {
  static String encode(String word){
    word = word.toLowerCase();
    String result = "";
    for (int i = 0; i < word.length(); ++i) {
      char c = word.charAt(i);
      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
    }
    return result;
  }
}
 */