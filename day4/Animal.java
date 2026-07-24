package day4;

 class Animal {
    public static void main(String[] args){
                bb b = new bb();
                b.name="snin";
                b.name = "abin";
                b.dis();
                b.display();
    }
}
class aa{
    String name;
    public  void display(){
        
      System.out.println("Executing main class");
}
    }
    
class bb extends aa{
    public  void dis(){
        
        
         System.out.println("Executing the sub class");
         System.out.println("printing my name"+name);

         
    }
    
}
