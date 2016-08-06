package my_java;
import java.util.Scanner;
public class Binary {

public static void main(String[]args){
	
	    Scanner input = new Scanner (System.in);
	    
		int num = 0;
		
		System.out.println("Enter the number of items you want to enter : ");
		num = input.nextInt();
		
		int[] binary = new int[num];
		int searchValue = 0, index;
		
		System.out.println ("Enter "+num+" numbers : ");
		for (int i = 0; i < binary.length; i++){
			binary[i] = input.nextInt();
		}
		
		System.out.println ("Enter a number to search for: ");
		searchValue = input.nextInt();
		index = binarySearch(binary, searchValue);
		
		if (index != -1){
			System.out.println ("Found at index: " + index);
		}
		else {
			System.out.println("Not found");
		}
	}
	static int binarySearch (int[] search, int find){
		int start , end, midPt;
		start = 0;
		end = search.length - 1;
		
		while (start <= end){
			midPt = (start + end) / 2;
			
			if (search[midPt] == find){
				return midPt;
			}
			else if (search[midPt] < find){
				start = midPt + 1;
			}
			else {
				end = midPt - 1;
			}
		}
		return -1;
	}
}
