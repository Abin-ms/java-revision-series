public class objeectcreattion {
    public static void main(String []args){
        student S1 = new student();
        System.out.println(S1.rollno);
        System.out.println(S1.name);
        System.out.println(S1.addr);
        S1.display();
    }
}
class student {
    int rollno;
    String name;
    String addr;
    void display(){
        System.out.println("Display roll number");}
        student(){
            rollno = 0;
            name = null;
            addr = "buhahaaa";
        }
    
}
