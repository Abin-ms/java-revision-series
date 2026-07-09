class constt {
    int num;

    public static void main(String[] args) {

        System.out.println("Executing....");
        constt obj = new constt();
        System.out.println("printing the value of i:" + obj.num);
    }

    constt() {
        num = 5;
        System.out.println("Executing constructorr...");

    }
}
