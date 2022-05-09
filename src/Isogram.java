import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Kaitlyn Gatineau
 * Codewars Java May 8th 2022 Solution
 */
public class Isogram {
    public static String s; // character string

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = scanner.next();
        scanner.close();
        return s;
    }

    public static boolean isIsogram(String str) {
        ArrayList<Character> list = new ArrayList();
        String s = str.toLowerCase(Locale.ROOT);
        try {
            for (int i = 0; i < s.length(); i++) {
                if (!list.contains(s.charAt(i))) {
                    list.add(s.charAt(i));
                } else {
                    throw new Exception();
                }

            }
        } catch (Exception e) {
            System.out.println("Is NOT an isogram!");
            return false;
        }
        System.out.println("Is an isogram!");
        return true;
    }

    public static void main(String[] args) {
        getString();
        isIsogram(s);
    }
}