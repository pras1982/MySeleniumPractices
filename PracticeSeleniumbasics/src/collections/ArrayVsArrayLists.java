package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayVsArrayLists {

	public static void main(String[] args) {
		
		int myArr[]	=	new int[5];
		myArr[0]=5;
		myArr[1]=6;
		myArr[2]=7;
		myArr[3]=8;
		myArr[4]=9;
		
		ArrayList<Integer> myArrList	=	new	ArrayList<Integer>();
		//myArrList.add(10);
		//myArrList.add(20);
		for(int i = 0;i<myArr.length;i++) {
			myArrList.add(myArr[i]);
			System.out.println(myArrList.get(i));
		}
		for(Integer x:myArrList) {
			System.out.println(x);
		}
		myArrList.forEach(item->System.out.println(item)); //using lamda
		
		Iterator<Integer> itr	=	myArrList.iterator();
		while (itr.hasNext()) {
			System.out.println("My Iterator value is" + " " +itr.next());
			
		}
		
		//System.out.println(myArrList.toString());
		
		/*
		 * String myString[] = new String[5]; myString[0]="Sam"; myString[1]="Vinayak";
		 */
		//System.out.println(myArr.length);
		/*
		 * System.out.println(Arrays.toString(myArr)); for(int i=0;i<myArr.length;i++) {
		 * System.out.println(myArr[i]); }
		 */
		//System.out.println(Arrays.toString(myArr));
		//String ArrayListValues = Arrays.toString(myArr);
		
		/*
		 * List<int[]> ArrayResults = Arrays.asList(myArr); for(int
		 * i=0;i<ArrayResults.size();i++) { System.out.println(Arrays.toString(myArr));
		 * }
		 * 
		 * 
		 * 
		 * for (int x : myArr) { System.out.println(x); }
		 * 
		 * for(int y=0;y<myArr.length;y++) { System.out.println(myArr[y]); }
		 */
		
		

	}

}
