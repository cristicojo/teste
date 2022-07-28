// aabbbNnnncca --> a2b3n4c2a1
public class Teste4 {

	ppublic String convert(String input) {

		String[] out = input.toLowerCase().split("(?<=(.))(?!\\1)");
		StringBuilder ham = new StringBuilder();

		Arrays.stream(out).forEach(i -> ham.append((i.charAt(0))).append(i.length()));

		return ham.toString();
	}

	public static void main(String[] args) {

		System.out.println(new Teste4().convert("aabbbNnnncca"));
	}
}
