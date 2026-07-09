public class arraay {
 public static void main(String []args){
    int[] array={1,2,3,4,5,6,7};
    int sum=0;
    for(int i=0;i<=(array.length);i++){
       System.out.println("printing:"+i);
       sum=sum+i;
    }
System.out.println(sum);
int avg = sum/(array.length);
System.out.println(avg);
 }   
}
