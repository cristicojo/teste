import java.util.HashMap;
import java.util.Map;

public class Teste3 {

	public boolean anagrams(String s1, String s2){

		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();


		for(int i=0; i<charArray1.length; i++) {

			if (map1.get(charArray1[i]) == null) {
				map1.put(charArray1[i], 1);
			}
			else {
				Integer value = map1.get(charArray1[i]);
				map1.put(charArray1[i], ++value);
			}
		}

		for(int i=0; i<charArray2.length; i++) {

			if (map2.get(charArray2[i]) == null) {
				map2.put(charArray2[i], 1);
			}
			else {
				Integer value = map2.get(charArray2[i]);
				map2.put(charArray2[i], ++value);
			}
		}

		return map1.equals(map2);

	}

	public static void main(String[] args) {

		System.out.println(new Teste3().anagrams("abcd", "dbac"));
	}
}
