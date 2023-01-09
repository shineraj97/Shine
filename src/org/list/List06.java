package org.list;
import java.util.*;
public class List06 {
public static void main(String[] args) {
	List l=new ArrayList();
	
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	System.out.println(l);
	
	int io = l.indexOf(10);
	System.out.println(io);
}
}
