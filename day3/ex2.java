public class ex2 {
    public static void main(String[] args) {
        oper add = new oper();
        oper sub = new oper();
        add.addd(10, 20, 0);
        sub.subb(10, 20, 0);
    }
}

class oper {
    int num1;
    int num2;
    int num3;

    void addd(int x, int y, int z) {
        z = x + y;
        System.out.println("the sum is :" + z);
    }

    void subb(int x, int y, int z) {
        z = y - x;
        System.out.println("the difference is:" + z);
    }
}
