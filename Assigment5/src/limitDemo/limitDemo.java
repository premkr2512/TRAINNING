package limitDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class limitDemo {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(40);
		numbers.add(60);
		numbers.add(20);
		numbers.add(-1000);
		numbers.add(-87);
		numbers.add(4);
		numbers.add(343);
		numbers.add(23);
		numbers.add(343);
		numbers.add(1454);
		numbers.add(1464);
		numbers.add(10);
		Stream<Integer> stream = numbers.stream();
		List<Integer> limit10 = stream.limit(10).collect(Collectors.toList());
		System.out.println("Limit output with 10 values: ");
		limit10.forEach(value -> System.out.println(value));

	}

}