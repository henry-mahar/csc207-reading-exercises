
public class StringMethods {
	public static void main(String[] args) {
		System.out.println(endsWithRep("foobarbar", "bar", 2));
		System.out.println(endsWithRep("foobarbar", "baz", 1));
	}
	public static boolean endsWithRep(String s1, String s2, int n) {
		String comp = new String();
		for(int x = n; x > 0; x--) {
			comp += s2;
		}
		if (s1.endsWith(comp)) {
			return true;
		} else {
			return false;
		}
	}
}
