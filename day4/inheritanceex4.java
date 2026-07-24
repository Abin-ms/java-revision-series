package day4;

class inheritanceex4 {
    public static void main(String[] args){
           dog dd = new dog();
           dd.display();
    }
    
}
class Animal{
    String name = "abin";
   
}
class dog extends Animal{
    String name = "jibin";
    public void display(){
        System.out.println("printing name of sub class"+name);
        System.out.println("Printing the name using 'super'"+super.name);

    }
}
