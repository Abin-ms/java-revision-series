package day14;

import java.util.Optional;

public class optionalex2 {
    public static void main(String[] args) {
        String greeting = "Hello, Java!";

        // Safe because greeting is guaranteed not to be null
        Optional<String> opt = Optional.of(greeting);
        System.out.println(opt.get()); // Outputs: Hello, Java!

        // DANGER: Passing null to of() causes a crash
        String nullName = null;
        Optional<String> crashOpt = Optional.of(nullName); // Throws NullPointerException!
        System.out.println(crashOpt);

        // Optional<String> crashOpt = Optional.of(nullName); // Returns Optional.empty !!!!
        // System.out.println(crashOpt);

    }
}
