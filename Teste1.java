import java.util.*;
import java.util.stream.Collectors;

// print the smallest int positive number != 0 from an array that is not present in the array
public class Teste2 {

	public Teste2() {
	}


	public int andrei(int[] p) {

		Set<Integer> s = Arrays.stream(p).boxed().collect(Collectors.toCollection(TreeSet::new));

		for (int i = 1; i <= s.size(); i++) {

			if (!(s.contains(i))) {
				return i;
			}
		}

		return 0;
	}

	public int[] citire() {

		Scanner s = new Scanner(System.in);
		System.out.print("Dati nr de sloturi = ");

		int n = s.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = s.nextInt();
		}

		return a;
	}

	public void afisare(int[] a) {

		Arrays.stream(a).forEach(elem -> System.out.print(elem+" "));
		System.out.println();
	}

	public void eroare(int[] m) {

		Set<Integer> s = Arrays.stream(m).boxed().collect(Collectors.toCollection(TreeSet::new));
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= s.size(); i++) {
			list.add(i);
		}

		if (s.containsAll(list)) {
			System.out.println("Please give numbers > 1");
			int[] b = citire();
			afisare(b);
			eroare(b);
			andrei(b);
		}

	}


	public static void main(String[] args) {

		Teste2 cristi = new Teste2();

		int[] b = cristi.citire();
		cristi.afisare(b);
		cristi.eroare(b);
		System.out.println(cristi.andrei(b));

	}
}
