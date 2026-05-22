public class duplicate_character {
    public static void main(String[] args) {
        String s = "programming";
        System.out.println("Duplicate characters in '" + s + "':");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println(s.charAt(i));
                    break; // To avoid printing the same character multiple times
                }
            }
        }
    }
    
}
