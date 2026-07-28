public class defconstructor {
    public static void main(String []args){
        System.out.println("executing");
        aaaa a2 = new aaaa(5,"abin");
         a2.display();
        
    }
}
class aaaa{
    int rollno;
    String name;
    aaaa(int rollno,String name){
        System.out.println("haiaiaiaiaia");
        //  rollno = 0;
        //  name = "";
        System.out.println(rollno);
        System.out.println(name);
    }

     void display(){
        rollno = 10;
        System.out.println(rollno);
     }
    }

