package org.map;
import java.util.*;
import java.util.Map.Entry;
public class Map02 {
public static void main(String[] args) {
Map<Integer, String> m=new HashMap<>();
	
	m.put(10, "java");
	m.put(20, "sql");
	m.put(30, "os");
	m.put(40, "sql");
	m.put(50, "selenium");
	m.put(10, "python");
	System.out.println(m);
	
	//To iterate
	Set<Entry<Integer, String>> en = m.entrySet();
	for (Entry<Integer, String> x : en) {
	System.out.println(x.getKey());
	System.out.println(x.getValue());
	}
}
}
