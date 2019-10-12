package lab4;

public class Searcher 
{
	//Linear Search Method
	public int linearSearch(int arr[],int arrSize,int searchVal)
	{
		int index =0;
		while(index < arrSize)
		{
			if (arr[index] == searchVal)
			{
				return index;
			}
			index++;
		}
		
		return -1;
		
	}
	
	//Binary Search Method
	public int binarySearch(int arr[],int arrSize,int searchVal)
	{
		Sorter obj = new Sorter();
		
		arr=obj.selectionSort(arr, arrSize);// stores the sorted array in arr  Big n log n
		
		int start =0, end=arrSize-1,mid;
		while(start <=end) //big O log n
		{
			mid= (start+end)/2;
			if(searchVal == arr[mid])
			{
				return mid;
			}
			if(searchVal < arr[mid])
			{
				end = mid-1;
			}
			if(searchVal > arr[mid])
			{
				start = mid + 1;
			}
		}
		return -1;
		
	}
	
	
}
