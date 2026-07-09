public class methodtest2 {
    public static void main(String []args){
        System.out.println("executing");
        aa a1 = new aa();
        bb b1 = new bb();
        System.out.println(a1.a);
        System.out.println(a1.b);
        // a1.aa();
        b1.add();

    }
}
class aa{
     int a,b;
    aa(){
        a=10;
        b=5;
    //     System.out.println("a is eqaul to :"+a);
    //     System.out.println("b is equal to :"+b);
    // 
    }
}
 class bb{
int x,y,z;
void add(){
    x=22;
    y=44;
    System.out.println("print:"+x);
    System.out.println("print:"+y);
    z=x+y;
    System.out.println("print:"+z);

}
 }
