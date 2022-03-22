public class TruthTable {

	public static void main(String[] args) {

		String s1 = "10010101";
		String s2 = "11001101";
		String AND = "";
		String OR = "";
		String XOR = "";
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == '1') {
					AND += '1';
				} else {
					AND += '0';
				}
				if (s1.charAt(i) == '1' || s2.charAt(i) == '1') {
					OR += '1';
				} else {
					OR += '0';
				}
				if (s1.charAt(i) != s2.charAt(i)) {
					XOR += '1';
				} else {
					XOR += '0';
				}
			}
			System.out.printf("AND: %s\nOR: %9s\nXOR: %s", AND, OR, XOR);
		} else {
			System.out.println("Please enter the string lengths equal!");
		}
	}

}
