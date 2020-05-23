package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		Collection<Fruit> fruits = new ArrayList<>();
		fruits.add(new Mango());
		fruits.add(new Apple());	
		Application.eat(fruits);
		
		List<? super Number> list = new ArrayList<>();
		list.add(new Integer(2));
		
		
		ArrayList<? extends Fruit> lf = new ArrayList<Mango>();

		 Fruit f = lf.get(1);
		/// lf.add(new Mango());
		
	}
	
	public static void eat(Collection<? super Fruit> fruits) {		
		for(Object frut : fruits) {
			System.out.println(frut);
		}		
		
		fruits.add(new Fruit());
		fruits.add(new Apple());
		
		for(Object frut : fruits) {
			System.out.println(frut);
		}		
	}
}

class Fruit {
	String taste;	
	Fruit(){}	
    Fruit(String taste){
		this.taste = taste;
	}
}

class Apple extends Fruit {	}

class Mango extends Fruit {	}