package day4;

class polymorphismm {
    public static void main(String[] args){
        square ss = new square();
        triangle tt = new triangle();
        rectangle rr = new rectangle();
        ss.render();
        tt.render();
        rr.render();

    } 
}

class polygon{
    public void render(){
        System.out.println("Rendering polygon.....");
    }
}
class square extends polygon{
    public void render(){
        System.out.println("Rendering Square.....");
    }
}
class triangle extends polygon{
    public void render(){
        System.out.println("Rendering triangle.....");
        }
}
class rectangle extends polygon{
    public void render(){
        System.out.println("Rendering rectangle...");
}        
    }
