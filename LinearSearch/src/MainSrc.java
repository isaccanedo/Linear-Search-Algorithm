/*
 * This program demonstrates how a Linear Search algorithm works
 * Source: https://www.geeksforgeeks.org/linear-search/
 */

import java.util.Scanner;

public class MainSrc {

	public static void main(String[] args) {
		
		System.out.println("Linear Search Algorithm by IasJem\n");
		
		Scanner n = new Scanner(System.in);
		
		int[] arr = {3,4,5,6 }; int query;
		
		LinearSearch linearSearch = new LinearSearch();
		
		System.out.print("Enter the value of n: ");
		linearSearch.setN(Integer.parseInt(n.nextLine()));
		
		query = linearSearch.searchN(arr, linearSearch.getN());
		
		if (query == -1) {
			System.out.println(linearSearch.getN() + " not found on query.");
		} else {
			System.out.println(linearSearch.getN() + " found on query.");
		}
		
		n.close();
	
		
	}

}
