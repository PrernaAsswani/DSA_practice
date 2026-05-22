public class equals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = new String("Hello");


        System.out.println("S1 == S2:" + (s1 == s2 ));
        System.out.println("S1 == S3:" + (s1 == s3 ));
        System.out.println("s1.equals(s3):" + s1.equals(s3));
    }
}
