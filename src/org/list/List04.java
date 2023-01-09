package org.list;
import java.util.*;
public class List04 {
public static void main(String[] args) {
	List l=new LinkedList();
	
	l.add(100);
	l.add(200);
	l.add(300);
	l.add(400);
	l.add(500);
	l.add(600);
	l.add(700);
	System.out.println(l);
	
	int size = l.size();
	System.out.println(size);
}
}
