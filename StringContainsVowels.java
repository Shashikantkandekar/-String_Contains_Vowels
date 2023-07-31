public class  StringContainsVowels {

    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Ritu")); // true
        System.out.println(stringContainsVowels("aai")); // false
    }

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".[aeiou].");
    }

}