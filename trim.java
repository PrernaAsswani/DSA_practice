public class trim {
    public static void main(String[] args) {
        String s = "    Hello World     \t";
        System.out.println("Original: '" + s + "'");
        System.out.println("Trim: '" + s.trim() + "'");
        System.out.println("Strip (Java 8 compatible): '" + s.trim() + "'");
        System.out.println("isBlank (Java 8 compatible): " + s.trim().isEmpty());

    }

    
}