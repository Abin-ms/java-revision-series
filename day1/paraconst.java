public class paraconst {
    public static void main(String[] args) {

        aaa a1 = new aaa(10, "Abin");

        System.out.println(a1.rr);
        System.out.println(a1.hh);
    }
}

class aaa {
    int rr;
    String hh;

    aaa(int r, String h) {
        rr = r;
        hh = h;
    }
}