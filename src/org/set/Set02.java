package org.set;
import java.util.*;
public class Set02 {
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
	
	//To iterate
	System.out.println("==for each==");
	for (Integer x : s) {
		System.out.println(x);
	}
}
}
