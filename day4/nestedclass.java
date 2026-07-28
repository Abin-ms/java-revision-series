package day4;

class nestedclass {
    public static void main(String[] args) {
        phone pp = new phone();
        phone.display dd = pp.new display();
        phone.camera cc = pp.new camera();

        dd.setValue1(15000, "samsung");
        dd.getvalue1();
        cc.setValue2(120, "Sony");
        cc.getvalue2();

    }
}

class phone {
    class display {
        int rate;
        String manufacturer;

        public void setValue1(int rate, String manufacturer) {
            this.rate = rate;
            this.manufacturer = manufacturer;

        }

        public void getvalue1() {
            System.out.println("the display rate is : " + rate);
            System.out.println("Manufacturer is : " + manufacturer);
        }

    }

    public class camera {
        int megapixel;
        String manufacturer;

        public void setValue2(int megapixel, String manufacturer) {
            this.megapixel = megapixel;
            this.manufacturer = manufacturer;
        }

        public void getvalue2() {
            System.out.println("The camera is of " + megapixel + "MP");
            System.out.println("Manufatured by : " + manufacturer);
        }

    }
}
