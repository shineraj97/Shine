package org.set;
import java.util.*;
public class Set01 {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		
		//To add values
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(10);
		System.out.println(s);
		
		//To find length
		int size = s.size();
		System.out.println(size);
		
		//To remove the value from set
		s.remove(30);
		System.out.println(s);
		
		//To check the set is empty
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		//To check the value is present or not
		boolean contains = s.contains(20);
		System.out.println(contains);
		
		//To clear the set
		s.clear();
		System.out.println(s);
	}

}
