package org.list;
import java.util.*;
public class List07 {
public static void main(String[] args) {
	List l=new ArrayList();
	
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	l.add(10);
	l.add(10);
	l.add(40);
	l.add(50);
	System.out.println(l);
	
	int io = l.indexOf(10);
	System.out.println(io);
}
}
