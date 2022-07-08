package minDemo;

import java.util.*;

class minDemo {
  
    // Driver code
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        Integer var = list.stream().min(Integer::compare).get();
        System.out.print(var);
    }
}
