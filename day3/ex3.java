public class ex3 {
    public static void main(String[] args) {
        gulu a = new gulu();
        gulu b = new gulu();
        gulu c = new gulu();
        gulu d = new gulu();
        gulu e = new gulu();

        a.op1(10, 2, 0);
        b.add(10, 2, 0);
        c.diff(10, 2, 0);
        d.div(10, 2, 0);
        e.prod(10, 2, 0);

    }
}

class gulu {
    int num1, num2, num3;

    void op1(int x, int y, int z) {
        z = (x + y) ^ 2;
        System.out.println("result : " + z);
    }

    void add(int x, int y, int z) {
        z = x + y;
        System.out.println("the sum is : " + z);
    }

    void diff(int x, int y, int z) {
        z = y - x;
        System.out.println("The difference is :" + z);
    }

    void div(int x, int y, int z) {
        z = x / y;
        System.out.println("the result is:" + z);

    }

    void prod(int x, int y, int z) {
        z = x * y;
        System.out.println("the product is : " + z);

    }
}
