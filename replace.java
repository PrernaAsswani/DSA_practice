public class replace {
    public static void main(String[] args) {
        String s = "java is prrogramming language";
        System.out.println(s.replace("java", "Python"));
        System.out.println(s.replaceAll("\\s+", "-"));
    }
}
