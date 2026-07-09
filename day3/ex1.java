public class ex1 {
    public static void main(String[] args) {
        lamp S1 = new lamp();
        lamp S2 = new lamp();
        S1.turnon();
        S2.turnoff();

    }
}

class lamp {
    boolean ison;

    void turnon() {
        ison = true;
        System.out.println("is the light is on?" + ison);
    }

    void turnoff() {
        ison = false;
        System.out.println("is the light is on?" + ison);
    }

}
