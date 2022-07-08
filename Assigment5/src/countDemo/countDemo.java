package countDemo;

import java.util.Arrays;
import java.util.List;
 
public class countDemo {
 
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long count1 = numbers.stream().count();
        System.out.println("count of Numbers is = " + count1);
        List<String> sectors = Arrays.asList(
                "Motor", 
                "Power", 
                "Steel", 
                "Chemicals", 
                "Capital"
                );
        long count2 = sectors.stream().count();
        System.out.println("count of String is = " + count2);
    }
}
