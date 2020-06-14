//String name = "Xiaoxiang Liu (Steven)";
//String netID = "xliu102";
//String assignment_number = "CSC_172_Lab_2"; 
//String lab_selection_ time = "MW 6:15PM - 7:30PM";
//String statement = "I did not collaborate with anyone on this assignment.";

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3Task2 {

	public static void runningSum2DArray(int[][] array, int dir) {
		
		//left
		if(dir == 1) {
			for(int i = 0; i < 4; i++){
				for(int j = 3; j > 0; j--){
					array[i][j - 1] += array[i][j];
				}
				for(int j = 0; j < 4; j++){
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		//right
		else if(dir == 2) {
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 3; j++){
					array[i][j + 1] += array[i][j];
				}
				for(int j = 0; j < 4; j++){
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		//up
		else if(dir == 3) {
			for(int i = 3; i > 0; i--){
				for(int j = 0; j < 3; j++){
					array[i - 1][j] += array[i][j];
				}
			}
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		//down
		else if(dir == 4) {
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 4; j++){
					array[i + 1][j] += array[i][j];
				}
			}
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
	public static void runningSum2DArrayList(ArrayList< ArrayList< Integer > > list, int dir) {
		
		//left
		if(dir == 1) {
			for(int i = 0; i < 4; i++){
				for(int j = 3; j > 0; j--){
					list.get(i).set(j - 1, list.get(i).get(j - 1) + list.get(i).get(j));
				}
				for(int k = 0; k < 4; k++){
					System.out.print(list.get(i).get(k) + " ");
				}
				System.out.println();
			}
		}
		
		//right
		else if(dir == 2) {
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 3; j++){
					list.get(i).set(j + 1, list.get(i).get(j + 1) + list.get(i).get(j));
				}
				for(int j = 0; j < 4; j++){
					System.out.print(list.get(i).get(j) + " ");
				}
				System.out.println();
			}
		}
		
		//up
		else if(dir == 3) {
			for(int i = 3; i > 0; i--){
				for(int j = 0; j < 4; j++){
					list.get(i - 1).set(j, list.get(i - 1).get(j) + list.get(i).get(j));
				}
			}
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					System.out.print(list.get(i).get(j) + " ");
				}
				System.out.println();
			}
		}
		
		//down
		else if(dir == 4) {
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 4; j++){
					list.get(i + 1).set(j, list.get(i + 1).get(j) + list.get(i).get(j));
				}
			}
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					System.out.print(list.get(i).get(j) + " ");
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//input arrays with ";" between them
		String[] temp = scanner.nextLine().split(";");

		//input integers with white space between them
		int[][] arr = new int[4][4];
		for(int i = 0; i < 4; i++){
			String[] tempA = temp[i].split("\\s");
			for(int j = 0; j < 4; j++){
				arr[i][j] = Integer.parseInt(tempA[j]);
			}
		}
		
		//input integers with white space between them
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < 4; i++){
			String[] tempA = temp[i].split("\\s");
			list.add(i, new ArrayList<Integer>());
			for(int j = 0; j < 4; j++){
				list.get(i).add(j, Integer.parseInt(tempA[j]));
			}
		}
		
		runningSum2DArray(arr, 1);
		runningSum2DArray(arr, 2);
		runningSum2DArrayList(list, 3);
		runningSum2DArrayList(list, 4);
		
		scanner.close();

	}

}
