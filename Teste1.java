import java.util.*;
import java.util.stream.Collectors;

// print the smallest int positive number != 0 from an array that is not present in the array
public class Teste1 {

	public int find(Integer[] a) {

		List<Integer> list = Arrays.asList(a);
		Set<Integer> set = new TreeSet<>(list);

		return Stream.iterate(0, i -> i + 1)
				.filter(i -> !set.contains(i))
				.findFirst()
				.get();

	}


	public static void main(String[] args) {

		Integer[] a = new Integer[]{3, 9, 0, 4, 1, 3};
		System.out.println(new Teste1().find(a));
	}
}
