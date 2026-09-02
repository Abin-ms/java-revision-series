//example program which uses empty() and of().
package day14;

import java.util.Optional;

public class optionalex3 {
    public static void main(String[] args){
        String[] str = new String[5];
        str[2] = "hey buyouuu";

        Optional<String> variable1 = Optional.empty();
        System.out.println(variable1);
    
        Optional<String> variable2 = Optional.of(str[2]);
        System.out.println(variable2);

    }
}
