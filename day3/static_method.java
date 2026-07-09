public class static_method {
    public static void main(String[] args) {
        System.out.println(MathUtil.square(5));
        hellooo.add();
    }
}

class MathUtil {
    static int square(int n) {
        return n * n;
    }
}

class hellooo {
    public static void add() {
        System.out.println("helloooo");
    }
}
