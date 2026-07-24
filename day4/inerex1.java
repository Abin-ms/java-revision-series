package day4;

class inerex1 {
    String name = "abin";
}
class inner extends inerex1{
    public  void display(){
       System.out.println("My name is "+name);
    }
    
}
class Main{
    public static void main(String[] args){
        inner inn = new inner();

        inn.display();
    }
}
