package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Alist {

	public static void main(String[] args) {
		ArrayList<String> AL	=	new ArrayList<>();
		AL.add("Sam");
		AL.add("Vinayak");
		AL.add("Jai");
		System.out.println(AL.toString());
		AL.remove(1);
		System.out.println(AL.toString());
		Iterator<String> It	=	AL.iterator();
		while (It.hasNext()) {
			System.out.println(It.next());
			
		}
	}

}
