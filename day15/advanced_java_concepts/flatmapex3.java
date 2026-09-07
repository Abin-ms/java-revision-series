    package day15.advanced_java_concepts;

    import java.util.Arrays;
    import java.util.List;

    public class flatmapex3 {
        public static void main(String[] args){
            List<List<String>> names = Arrays.asList(
            Arrays.asList("Abin", "Rahul"),
            Arrays.asList("John", "Alex"),
            Arrays.asList("Sam", "David")
    );

    names.stream()
    .flatMap(list -> list.stream())
    .filter( name -> name.length() >= 4)
    .forEach(name -> System.out.println(name));
        }
    }
