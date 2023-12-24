package test2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Code {

	public static void main(String[] args) {
		//Add changes from local
		String str1="abaccvv";
		List<Integer> l1=Arrays.asList(1,2,3,4,5);
		Optional<Integer> findFirst = l1.stream().sorted((a,b)->b.compareTo(a)).limit(1).findFirst();
		System.out.println(findFirst);
		char[] c=str1.toCharArray();
		boolean flag=false;
		Set<Character> s=new HashSet<>();
		for(int i=0;i<c.length-1;i++) {
			s.add(c[i]);
		}
		s.forEach(x->System.out.println(x));
	 
//		List<Character> l1= new ArrayList<>(c);

	}

}
