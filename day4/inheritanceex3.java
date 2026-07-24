package day4;

public class inheritanceex3 {
    public static void main(String[] args){
            dog dd = new dog();
            dd.display();
    }
}
class Anima{
    public void display(){
        System.out.println("This is the Parent class");
    }
}
class dog extends Anima{
    //method overriding just happened here.
    public void display(){
        System.out.println("This is the child/sub-class ");
        super.display();
    }
}

//this is the example or test case for using super keyword for accessing the method of parent class "display()" which was overrided by the child classes method "display()"
//note : We cannot use the super key word inside a static class or method.
