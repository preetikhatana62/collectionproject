package javaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;


public class toarray {
	public static void main(String[] args) {
		 
		List<Integer>list=Arrays.asList(9,2,3,4,5,6,7);
		     System.out.println(list);
		     int  [] a= {9,2,3,4,5,6,7};
		     OptionalDouble g= Arrays.stream(a).average();
		     System.out.println(g);
		       int[] s = Arrays.stream(a).toArray();
		      
		     System.out.println(s.length);
		     int n=Arrays.stream(a).sum();
		     System.out.println(n);
		    Optional l1= list.stream().findAny();
		    System.out.println(l1.get());
		    boolean nb = list.stream().allMatch(e->e%2==0);
		    System.out.println(nb);
		    boolean nb1 = list.stream().anyMatch(e->4/2==2);
		    System.out.println(nb1);
		     
	}

}
