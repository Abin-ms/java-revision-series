public class squaresum {
    public static void main(String []args){
        int i=0;
        int square=0,sum=0;
        for(i=1;i<10;i++){
             square = i*i;
             sum=sum+square;
        }
        System.out.println("printing the square of last number:"+square);
        System.out.println("printing the sum:"+sum);
    }
    
}
