package reduce;

import java.util.Arrays;
import java.util.List;

public class TestReduce {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2,3,4,5,6,7,8,9);
		int even = number.stream()
				.filter(x -> x % 2 == 0)
				.reduce(10, (a,b) ->a+b);
		System.out.println(even);
		
		List<Integer> number1 = Arrays.asList(2,4,5,6,10,3,9,32);
				int even1 = number1.stream()
				.filter(x -> x % 2 == 0)
				.reduce((a,b) -> a+b)
				.get();
		System.out.println(even1);
	}

}
