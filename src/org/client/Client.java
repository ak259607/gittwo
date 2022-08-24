package org.client;

import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Client {
public static void main(String[] args) {
	
	Map<String, Integer> m = new TreeMap();
	
	m.put("Ajith", 1000);
	m.put("Priya", 2000);
	m.put("Srinivasan", 3000);
	m.put("Suyapabha", 4000);
	m.put("null", 5000);
	m.put("a", 5000);
	
	
	int size = m.size();
	System.out.println(size);
	
	Integer integer = m.get("Ajith");
	System.out.println(integer);
	
	boolean containsKey = m.containsKey("Piya");
	System.out.println(containsKey);
	
	boolean containsValue = m.containsValue(4000);
	System.out.println(containsValue);
	
	Set<String> keySet = m.keySet();
	System.out.println(keySet);
	
	Collection<Integer> values = m.values();
	System.out.println(values);
	
	m.remove("Ajith");
	System.out.println(m);
	
	Set<Entry<String, Integer>> entrySet = m.entrySet();
	
	for (Entry<String, Integer> entry : entrySet) {
		System.out.println(entry);
	}
	for (Entry<String, Integer> x : entrySet) {
		String key = x.getKey();
		System.out.println(key);
		
		Integer value = x.getValue();
		System.out.println(value);
	
	
	}
}
}
