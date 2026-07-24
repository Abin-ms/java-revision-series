package day4;

class inheritanceexample5 {
    public static void main(String[] args){
       bb1 b = new bb1();
       b.huu();
      
    }
}
class AA1{
     void display(){
        System.out.println("Executing the parent class");
    }
}
class bb1 extends AA1{
    public void huu(){
         super.display();
        System.out.println("executing the child class");

    }
    
}