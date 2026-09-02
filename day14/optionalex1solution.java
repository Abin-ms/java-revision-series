package day14;
import java.util.Optional;

public class optionalex1solution {
    public static void main(String[] args){

        // List<Integer> numbers = Arrays.asList(10,20,25,30);

        // Optional<Integer> result = Optional.of(35);
        // System.out.println(result.isPresent());
        // System.out.println(numbers);
        String[] words = new String[10];

        Optional <String> result = Optional.ofNullable(words[5]);

        if(result.isPresent()){
            String word = words[5].toLowerCase();
        System.out.println(word);

        }
        else{
            System.out.println("Word is empty");
        }
    }
}
