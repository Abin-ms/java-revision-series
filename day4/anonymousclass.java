package day4;

class anonymousclass {
    public static void main(String[] args) {
        Demo dd = new Demo();
        dd.subclassfn();
    }
}

class Main {
    public void display() {
        System.out.println("Super class is executing...");
    }
}

class Demo {
    public void subclassfn() {

        Main mm = new Main() {

            public void display() {
                System.out.println("executing in anonymous class....");

            }
        };
        mm.display();
    }
}
