import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TeachersGift {
    public static void main(String[] args){
        List<String> studentnames= Arrays.asList("Bob","Peter","Angel","Ana","Alex","Andrews","Walt","Susan","Disney","Nandy");
        List<String> studentnameA=studentnames.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
System.out.println("Students with name starting with A" +studentnameA);
List<String> studentwithSpecialGift=new ArrayList<>(studentnameA);
System.out.println("Student with special gift"+studentwithSpecialGift);
    }
}
