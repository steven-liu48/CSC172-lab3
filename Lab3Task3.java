//String name = "Xiaoxiang Liu (Steven)";
//String netID = "xliu102";
//String assignment_number = "CSC_172_Lab_2"; 
//String lab_selection_ time = "MW 6:15PM - 7:30PM";
//String statement = "I did not collaborate with anyone on this assignment.";

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab3Task3 {
	// Using basic while / for loop
	public static void printArrayListBasicLoop(ArrayList<Integer> al) {
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
	
	//Enhanced for loop
	public static void printArrayListEnhancedLoop(ArrayList<Integer> al) {
		for(int element: al) {
			System.out.println(element);
		}
	}
	
	// Using basic for loop with iterator
	public static void printArrayListForLoopListIterator(ArrayList<Integer> al) {
		for (Iterator<Integer> it = al.iterator(); it.hasNext(); ){
            int nextInt = it.next();
            System.out.println(nextInt);
        }
	}
	
	// Using basic while loop with iterator
	public static void printArrayListWhileLoopListIterator(ArrayList<Integer> al) {
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()){
            int nextInt = it.next();
            System.out.println(nextInt);
        }
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//input integers with white space between them
		ArrayList<Integer> list = new ArrayList<Integer>();
		String[] tempB = scanner.nextLine().split("\\s");
		for(String s : tempB) {
			list.add(Integer.parseInt(s));
		}

		printArrayListBasicLoop(list);
		printArrayListEnhancedLoop(list);
		printArrayListForLoopListIterator(list);
		printArrayListWhileLoopListIterator(list);

		scanner.close();


	}

}
