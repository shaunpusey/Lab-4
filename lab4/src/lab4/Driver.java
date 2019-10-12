package lab4;
import java.util.*;

public class Driver 
{

	public static void main(String[] args) 
	{
		int option;
		Scanner x = new Scanner(System.in);
		
		int[] array = new int [5];
		
		System.out.println("Please enter values");
		
		for(int y=0; y < array.length;y++)//loop to acccpt array ----- Big O log n
		{
			array[y]= x.nextInt();
		}
		for(int y=0; y < array.length;y++)//loop to print array--- big O log n
		{
			System.out.print(array[y]+" ");
		}
		//x.close();// prevents resource leaks
		
		
		
		System.out.println("\nSelect the number that performs the operation you want\n\n");
		System.out.println("Linear Search \t\t 1");
		System.out.println("Binary Search \t\t 2");
		System.out.println("Insertion Sort \t\t 3");
		System.out.println("Bubble Sort \t\t 4");
		System.out.println("Selection Sort \t\t 5");
		option = x.nextInt();	
		
		if(option == 1) //Linear searches through selection
		{
			int Lnum,searchVal,fin;
			System.out.println("Please enter the number you are searching for");
			Lnum = x.nextInt();
			searchVal = Lnum;
			
			Searcher obj = new Searcher();
			
			obj.linearSearch(array,5,searchVal);//Big O n
			fin = obj.linearSearch(array,5,searchVal);
			System.out.println("Index is "+fin);
			
		}
		if(option == 2)//Binary Search comeback here
		{
			
			
			int Bnum,searchVal,fin;
			System.out.println("Please enter the number you are searching for");
			Bnum = x.nextInt();
			searchVal=Bnum;
			Searcher obj1 = new Searcher(); //big o n^2
			
			fin = obj1.binarySearch(array, 5,searchVal);
			System.out.println("Index is "+fin);
			
		}
		if(option ==3 )//insertion sort
		{
			
			System.out.println("Original list");
			for(int count = 0 ;count<5;count++) //Big o n
			{
			System.out.printf(array[count]+" ");
			}
			System.out.println();
			
			Sorter Sobj = new Sorter();
			
			array=Sobj.insertionSort(array, 5);//array values are sorted and stored in array //big o n^2
			Display(array,5);
			
			
		}
		if(option == 4)//Bubble sort
		{
			System.out.println("Original list");
			for(int count = 0 ;count<5;count++) // big o n
			{
			System.out.printf(array[count]+" ");
			}
			System.out.println();
			
			
			Sorter Sobj1 = new Sorter();
			
			array=Sobj1.bubbleSort(array, 5);//array values are sorted and stored in array //big o n^2
			Display(array,5);
		}
		if(option == 5)//selection sort
		{
			System.out.println("Original list");
			for(int count = 0 ;count<5;count++) 
			{
			System.out.printf(array[count]+" ");
			}
			System.out.println();
			
			
			Sorter Sobj2 = new Sorter();
			
			array=Sobj2.selectionSort(array, 5);//array values are sorted and stored in array
			Display(array,5);
		}
		System.out.println();
		System.out.println("Big O for entire operation is: \t(n^2)");
		
		
		
	}
	public static int [] Display(int arr[],int arrSize)
	{
		System.out.println("Sorted List");
		for(int i=0;i<arrSize;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		return arr;
	}

}


