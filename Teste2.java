// aabbbNnnncca --> a2b3n4c2a1
public class Teste4 {

	public String convert(String input) {

		int S = 0;
		String ham = "";
		char[] charArray = input.toCharArray();


		for (int i = 0; i < charArray.length; i++) {
			ham = ham + String.valueOf(charArray[i]).toLowerCase();

			if (i + 1 < charArray.length && !String.valueOf(charArray[i]).equalsIgnoreCase(String.valueOf(charArray[i + 1]))) {
				ham = ham + ",";
			}
		}

		String[] arrOfStr = ham.split(",");

		ham = "";
		for (String s : arrOfStr) {
			ham = ham + s.charAt(0) + s.length();
		}

		return ham;

	}

	public static void main(String[] args) {

		System.out.println(new Teste4().convert("aabbbNnnncca"));
	}
}
