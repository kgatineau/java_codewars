import java.util.HashMap;

public class Welcome {
    public static String greet(String language){
    HashMap<String, String> greetings = new HashMap<>();
    greetings.put("english", "Welcome");
            greetings.put("czech", "Vitejte");
            greetings.put("danish", "Velkomst");
            greetings.put("dutch", "Welkom");
            greetings.put("estonian", "Tere tulemast");
            greetings.put("finnish", "Tervetuloa");
            greetings.put("flemish", "Welgekomen");
            greetings.put("french", "Bienvenue");
            greetings.put("german", "Willkommen");
            greetings.put("irish", "Failte");
            greetings.put("italian", "Benvenuto");
            greetings.put("latvian", "Gaidits");
            greetings.put("lithuanian", "Laukiamas");
            greetings.put("polish", "Witamy");
            greetings.put("spanish", "Bienvenido");
            greetings.put("swedish", "Valkommen");
            greetings.put("welsh", "Croeso");

            if (greetings.containsKey(language)){
                    return greetings.get(language);
            }
            return "Welcome";
    }

        public static void main(String[] args) {
                greet("english");
        }

}
