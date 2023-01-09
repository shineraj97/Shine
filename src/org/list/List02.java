package org.list;
import java.util.*;
public class List02 {
public static void main(String[] args) {
    List l=new ArrayList();
	
	l.add(10);
	l.add(true);
	l.add(50.0f);
	l.add("abc");
	l.add(80);
	l.add(9876543210l);
	l.add(84);
	l.add(10);
	l.add(100);
	System.out.println(l);
	
	List <Integer> y= new ArrayList<Integer>();
	
	y.add(1);
	y.add(2);
	y.add(3);
	y.add(4);
	y.add(5);
	y.add(6);
	y.add(7);
	
	l.addAll(y);
	System.out.println(l);
	
	l.retainAll(y);
	System.out.println(l);
	
	l.removeAll(y);
	System.out.println(l);
	
}
}
