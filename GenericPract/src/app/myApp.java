package app;

import java.util.ArrayList;
import java.util.Collection;

class MyClass<T> {
	
	public T obj ;
	
	public T getObj() {
		return this.obj;
	}
	
	public void setObj(T o) {
		this.obj = o ;
	}
	
}

class HashTable<K,V> {
	
	public K key ;
	public V value;
	
	public HashTable(K key, V val) {
		this.key = key ;
		this.value = val ;
	}

	@Override
	public String toString() {
		return "HashTable [key=" + key + ", value=" + value + "]";
	}
	
	
}

class Person implements Comparable {

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class myApp {
	
	public static <T extends Comparable> T compare(T t1, T t2) {
		
		if(t1.compareTo(t2) < 0) {
			return t1 ;
		}
		
		else 
			return t2 ;
	}
	
	public static void main(String args[]) {

		Collection<String> c = new ArrayList<>();
		c.add("Piyush");
		myApp.acceptAll(c);
		
	}
	
	public static void acceptAll(Collection<?> obj) {
		System.out.println(obj.toString());
	}
	
}
