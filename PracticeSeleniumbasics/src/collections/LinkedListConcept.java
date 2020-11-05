package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Sam");
		ll.add("Vincent");
		System.out.println(ll.getFirst());
		System.out.println(ll.toString());

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		for (String e : ll) {
			System.out.println(e);
		}

		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		Iterator<String> di	=	ll.descendingIterator();
		while (di.hasNext()) {
			System.out.println(di.next());
			
		}
		Iterator<String> ci	=	ll.listIterator();
		while(ci.hasNext()) {
			System.out.println(ci.next());
		}

	}

}
