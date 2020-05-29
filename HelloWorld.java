import java.util.HashSet;
import java.util.Set;

public class HelloWorld {
    public static void main(String[] args) {
        Set<Integer> seen = new HashSet<>();
        seen.add(1);
        System.out.println(seen);
        seen.remove(1);
        System.out.println(seen);
    } 
}

