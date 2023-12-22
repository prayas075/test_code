package test2;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = " J v a1234 ";
		String trim = "";
//	String replaceAll = trim.replaceAll("\\s", "");
//	System.out.println(replaceAll);
		
		System.out.println(str.charAt(7));
		System.out.println(Character.isDigit((str.charAt(7))));
	}

}
