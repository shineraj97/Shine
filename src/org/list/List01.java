package org.list;
import java.util.*;
public class List01 {
public static void main(String[] args) {
	List l=new ArrayList();
	
	//TO insert the values in the list
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
	
	//To count the number of value in the list
	int a = l.size();
    System.out.println(a);
    
    //TO get value using the index
    Object o = l.get(5);
    System.out.println(o);
    
    //To insert value in the particular index
    l.add(5, 50);
    System.out.println(l);
    
    //To delete particular index value
    l.remove(5);
    System.out.println(l);
    
    l.set(5, false);
    System.out.println(l);
    
    int i = l.indexOf(false);
    System.out.println(i);
    
    int li = l.lastIndexOf(10);
    System.out.println(li);
    
    boolean c = l.contains(10);
    System.out.println(c);
}
}
