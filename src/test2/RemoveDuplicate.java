package test2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str1="Thegreat prayas";
		StringBuilder sb2=new StringBuilder();
		
		for(int i=0;i<str1.length();i++) {
			char charAt = str1.charAt(i);
			int a=str1.indexOf(charAt,i+1);
			if(a==-1) {
				sb2.append(charAt);
			}
		}
		System.out.println(sb2);

	}

}
