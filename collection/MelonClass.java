package javaProject;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MelonClass {

	public static void main(String[] args) {
		Map< Integer ,Melon> map1=new HashMap< Integer,Melon>();
		Map< Integer ,Melon> map2=new HashMap< Integer,Melon>();
		map1.put(1, new Melon("good","10"));
		map1.put(1, new Melon("good","10"));
		System.out.println("first map");
		System.out.println();
		 Set<Integer> key=map1.keySet();
		 for( Integer e:key)
		 {
			 System.out.println(e);
			 
		 }
	  Collection<Melon> c1	=map1.values();
	  for(Melon m:c1) {
		  System.out.println(m);
	  }
		 System.out.println("second map");

		 map2.put(1, new Melon("good","10"));
		 map2.put(1, new Melon("good","10"));
		 Set<Integer> key2=map2.keySet();
		 for(Integer s2:key2)
		 {
			 System.out.println(s2);
		 }
		Collection <Melon > c= map2.values();
		for(Melon d:c)
		{
			System.out.println(d);
		}
		//it gives false
		System.out.println(map1.equals(map2));		 
		
	}
}
