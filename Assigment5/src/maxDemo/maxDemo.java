package maxDemo;

import java.util.*;
class maxDemo {
  
    // Driver code
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
  
        System.out.print("The maximum value is : ");
        Integer var = list.stream().max(Integer::compare).get();
  
        System.out.print(var);
    }
}