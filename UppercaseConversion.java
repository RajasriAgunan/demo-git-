import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UppercaseConversion {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        List<String> uppercase = names.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("given strem of names:" + Stream.of("aBc", "d", "ef").collect(Collectors.toList()));
        System.out.println("Output is:" + uppercase);
    }
}