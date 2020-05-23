package app;

import java.util.* ;

class Vegetable {
	
	String taste ;
	
	public void setTaste(String taste) {
		this.taste = taste ;
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	public String toString() {
		return this.taste ;
	}
}

class Potato extends Vegetable {}

class Tomato extends Vegetable {}

public class Generics {
	
	public static void main(String args[]) {
		
		/**
		 * This declaration <? extends Vegetable> states that the list is typed to the Vegetable class or its subclasses. The subclasses 
		 * can be Potato or tomato. We don't know which objects are stored in the list referred by cart variable , but its to be the 
		 * subclass of vegetable or the Vegetable itself. So the following statements are valid.
		 */
		ArrayList<? extends Vegetable> cart = new ArrayList<>();
		ArrayList<? extends Vegetable> cart1 = new ArrayList<Vegetable>();
		ArrayList<? extends Vegetable> cart2 = new ArrayList<Potato>();
		ArrayList<? extends Vegetable> cart3 = new ArrayList<Tomato>();

		/**
		 * We can read the <? extends Vegetable> list using Vegetable reference variable. but not using its subclass. This requires 
		 * explicit casting to Subclass. This is because we do not know which object types are actually stored in the list, we just
		 * know that its subclass of Vegetable.
		 */
		Vegetable aa = cart1.get(1) ;  // This is fine.
	//	Potato p = cart1.get(1);		// This gives compile time error. Requires casting to Potato.
		
		/**
		 * We cannot add objects of Vegetable, Potato or Tomato in the list <? extends Vegetable> because we do not know which type 
		 * of objects are stored in reality in the list referenced by cart reference variable. It can be Vegetable, or Potato or Tomato.
		 * We have no means of knowing it. So this gives compile time error. The following lines will not work.
		 */
		// cart.add(new Vegetable());
		// cart.add(new Potato());

		
		/**
		 * This declaration <? super Vegetable> states that the list is typed to the Vegetable class or its super classes. So the statement 3
		 * is not true as Potato is not super class of Vegetable. Here we know that the objects stored in the list refereed by c variable 
		 * have to be either of type Vegetable or its super class (in this case, the Object class) .
		 */
		ArrayList<? super Vegetable> c = new ArrayList<>();
		ArrayList<? super Vegetable> c1 = new ArrayList<Object>();
	//	ArrayList<? super Vegetable> c2 = new ArrayList<Potato>();   -- Statement 3
		
		/**
		 * For reading the ArrayList<? super Vegetable> , we have to use Object reference variable. As the subclasses reference variable will
		 * not work as we do not know the list if typed with which subclass. This statement 2 will not work. Or else we have to cast explicitly
		 * to Potato. This is like the same way we could type the ArrayList to potato in above step.
		 */
		Object o = c1.get(1);
	//	Potato p = c1.get(1); -- Statement 2
		
		/**
		 * ArrayList<? super Vegetable> is perfect for adding the subclasses into list. As the list is typed to be of Vegetable or its superclass ,
		 * We can add subclasses of Vegetable into the arrayList as per java rules. But we cannot add new Object() itself to the list as the Object
		 * is not Vegetable subclass.So, the statement 4 does not work it gives compile time error.
		 */
		c1.add(new Vegetable());
		c1.add(new Potato());
		c1.add(new Tomato());
	//	c1.add(new Object());
		
		/**
		 * Thus we can read generic collection using extends but its not ideal for adding elements
		 * We can read (by casting to Object) and Add elements into list which is <? super Vegetable>
		 */
		
	}
	
}
