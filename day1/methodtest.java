public class methodtest {
    public static void main(String []args){
        aaa a1 = new aaa();
        System.out.println("printing"+a1.a);
        System.out.println("printing"+a1.b);
        System.out.println("printing"+a1.c);
        a1.display();
        System.out.println("printing"+a1.x);
    }
     
}

class aaa{
    int a,b,c;
    int x;
    aaa(){
        a=10;
        b=5;
        c=2;
    }
void display(){
        System.out.println("haiii");
        x = a+b+c;
    }
}

