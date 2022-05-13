public class Kata {
    public static boolean solution(String str, String ending) {
        return  str.endsWith(ending);
    }

    public static void main(String[] args) {
        solution("abc", "bc");
    }
}