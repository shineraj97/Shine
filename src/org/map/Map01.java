package org.map;
import java.util.*;
public class Map01 {
public static void main(String[] args) {
	Map<Integer, String> m=new HashMap<>();
	
	//add values
	m.put(10, "java");
	m.put(20, "sql");
	m.put(30, "os");
	m.put(40, "sql");
	m.put(50, "selenium");
	m.put(10, "python");
	System.out.println(m);
	
	//To find length
	int size = m.size();
	System.out.println(size);
	
	//To get the particular value
	String s = m.get(30);
	System.out.println(s);
	
	//Displaying the key only and the return type is set
	Set<Integer> keySet = m.keySet();
	System.out.println(keySet);
	
	//Displaying the value only and its return type is collection
	Collection<String> values = m.values();
	System.out.println(values);
	
	//To check map is empty
	boolean empty = m.isEmpty();
	System.out.println(empty);
	
	//To check the key is present or not
	boolean containsKey = m.containsKey(30);
	System.out.println(containsKey);
	
	//To check the value is present or not
	boolean containsValue = m.containsValue("selenium");
	System.out.println(containsValue);
	
	//To remove the value
	m.remove(20);
	System.out.println(m);
}
}
