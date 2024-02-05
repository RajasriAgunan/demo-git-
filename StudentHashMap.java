import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>();
        map.put("Peter",7);
        map.put("Angel",9);
        map.put("Pal",10);
        map.put("Andrews",6);
        map.put("Susen",9);
        System.out.println(map);
        System.out.println(map.remove("Andrews"));
        map.put("Sam",10);
        System.out.println(map);}
}
