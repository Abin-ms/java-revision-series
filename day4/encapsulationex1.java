package day4;

class encapsulationex1 {
    public static void main(String[] args){
        Area aa = new Area(3,5);
        aa.getArea();

    }
}

class Area{
    int length;
    int breadth;
    Area(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea(){
        int area = length*breadth;
        System.out.println("Area is :"+area);
    }
}
