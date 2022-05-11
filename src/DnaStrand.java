import java.util.ArrayList;
import java.util.stream.Collectors;
/**
 * @author Kaitlyn Gatineau
 * Codewars Java May 10th 2022 Solution
 *
 */

public class DnaStrand {
    public static String makeComplement(String dna) {
        ArrayList<Character> characters = new ArrayList<>();
        // turn String 'dna' to a Character ArrayList
        for (char c : dna.toCharArray()) {
            //iterate through the ArrayList and swap the respective letters
            switch (c) {
                case 'A' -> c = 'T';
                case 'T' -> c = 'A';
                case 'C' -> c = 'G';
                case 'G' -> c = 'C';
            }
            characters.add(c);
            // add swapped letter to the ArrayList
        }
        String dnaMatch = characters.stream().map(String::valueOf).collect(Collectors.joining());
        // turn the Character ArrayList into the dnaMatch String
        System.out.println(dnaMatch);
        return dnaMatch;
    }

    public static void main(String[] args) {
        makeComplement("GATC");
    }
}

/*
"Best practice" Solution:
birgerhalfmeier, jackjack321, jives, kdogmillionaire, AhmadEliwa,
jojocarino, VasilenkoKV, user3939291, Emsy, ishawnspam (plus 18 more warriors)

public class DnaStrand {
  public static String makeComplement(String dna) {
    char[] chars = dna.toCharArray();
    for(int i = 0; i < chars.length; i++) {
      chars[i] = getComplement(chars[i]);
    }

    return new String(chars);
  }

  private static char getComplement(char c) {
    switch(c) {
      case 'A': return 'T';
      case 'T': return 'A';
      case 'C': return 'G';
      case 'G': return 'C';
    }
    return c;
  }
}

 */