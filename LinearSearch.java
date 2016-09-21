import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

	private int [] array;
	private int capacity;
	private int toSearch;
	private int range;
	
	private LinearSearch (int size){
		capacity = size;
		array = new int [capacity];

		
	}
	public void getArray(){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Please enter the range of random : ");
		range = input.nextInt();
		
		for (int i = 0; i < capacity; i++){
			int x = rand.nextInt(range);
			array[i] = x;
			}
		System.out.println();
	}
	public void show(){
		for (int i = 0; i < capacity; i++){
			
			System.out.println("Array [" +(i+1)+ "] = " + array[i]);
		}	
	}
	
	public void search(){
		Scanner input = new Scanner(System.in);
		int i;
		System.out.print("Plese enter the number to be search : ");
		toSearch = input.nextInt();
		
		for(i = 0; i<capacity;i++){
			if(toSearch == array[i]){
				System.out.print("The number been found in array["+(i+1)+"] = "+array[i]);
				break;
			}
			
		}
		if(i == array.length){
			System.out.print("The value not found!");		
			}
	}
	
	public static void main (String[] Args){
		
		int size;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter array size: " );
		size = input.nextInt();
		
		
		LinearSearch demo = new BinarySearch (size);
		demo.getArray();
		demo.show();
		demo.search();
		
		
		
	
	}
}
