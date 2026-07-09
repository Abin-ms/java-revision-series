public class string_tutorial {
    public static void main(String[] args) {
        String aa = "hello";
        String bb = "world";
        String cc = "niggaachuu";

        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);

        String neww1 = aa.concat(bb);
        System.out.println(neww1);

        System.out.println(aa.length());
        System.out.println(bb.length());
        System.out.println(cc.length());
        System.out.println(neww1.length());

        String n1 = "hey";
        String n2 = "hey";
        String n3 = "heyy";

        boolean res1 = n1.equals(n2);
        System.out.println(res1);

        boolean res2 = n2.equals(n3);
        System.out.println(res2);
    }
}
