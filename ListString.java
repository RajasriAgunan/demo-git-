import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListString {
public static void main(String[] args){
    List<String> list= Arrays.asList("abc","","bcg","efg","abcd","jkl");
    List<String> nonEmptyString=list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
    System.out.println("with  Empty String :"+list);
    System.out.println("without Empty Strings are:"+nonEmptyString);

}
}
