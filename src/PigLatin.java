import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PigLatin {

    public static String translate(String str) {

    return "";
    }

    /*
    public static String pigIt(String str) {
        StringBuilder st = new StringBuilder();
        List.of(str.split(" ")).forEach( word -> {
                    if (word.endsWith("!") || word.endsWith("?") || word.endsWith(".")) {
                        st.append(word, 1, word.length() - 1)
                                .append(word.charAt(0)).append(word.charAt(1)).append("ay").append(word.charAt(word.length() -1)).append(" ");
                    } else {
                        st.append(word.substring(2)).append(word.charAt(0)).append(word.charAt(1)).append("ay ");
                    }
                });
        System.out.println(st);
        return st.toString().trim();

    }



    public static void main(String[] args) {
       // pigIt("Hello There!");
    }
    */

}