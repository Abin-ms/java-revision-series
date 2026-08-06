package day8;

public class HashCodeDemo {
    public static void main(String[] args) {
        String s1 = "Java";

        String s2 = "Java";

        String s3 = "SQL";

        System.out.println(s1.hashCode());

        System.out.println(s2.hashCode());

        System.out.println(s3.hashCode());

        System.out.println(s1.equals(s2));

        System.out.println(s1.equals(s3));

        System.out.println(s1 == s2);
        System.out.println(s1.hashCode() == s3.hashCode());

    }
}
