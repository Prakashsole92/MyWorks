package mask;

public class Maskify {
	public static String maskify(String str) {

		int lengthOfString = str.length();
		StringBuilder sb = new StringBuilder();
		if (lengthOfString <= 4) {
			System.out.println(str);
			return str;
		} else {
			String str1 = str.substring(0, lengthOfString - 4);
			for (char c : str1.toCharArray()) {
				switch (c) {
				default:
					sb.append('#');
				}
			}
			String changed = sb.toString();
			str = str.substring(lengthOfString - 4, lengthOfString);
			String newstr = changed + str;
			System.out.println(newstr);
			return newstr;
		}
	}
}