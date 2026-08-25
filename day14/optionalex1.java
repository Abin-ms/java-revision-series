package day14;

public class optionalex1 {
    public static void main(String[] args){
        String[] words = new String[10];
        String word = words[5].toLowerCase();
        System.out.println(word);

        //implementation showing why optional was introduced.
        //if we run this code we will get Exception in thread "main" java.lang.NullPointerException - cause the String is empty.
        //we look how optional can be used to handle the nullPointerException.

    }
}
