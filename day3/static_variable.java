public class static_variable {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();
        System.out.println(S1.name);
        System.out.println(S2.name);
    }
}

class Student {
    static String name = "Abin";

}
