package lab4;

public class Sorter 
{
	//bubble sort method
 	public int[] bubbleSort(int arr[],int arrSize)
	{
		int index =0,temp,count,swapMade =1;
		while(index < arrSize && swapMade == 1)
		{
			swapMade = 0;
			count = arrSize -1;
			while(count > index)
			{
				if(arr[count]<arr[count-1])
				{
					temp = arr[count-1];
					arr[count -1]=arr[count];
					arr[count]=temp;
					swapMade =1;
				}
				count--;
			}
			index++;
		}
		
		
		/*for(int i = 0; i<arrSize;i++)
		{
			System.out.printf(arr[i]+" ");
		}*/
		return arr;
	}
	
	//insertion Sort method
	public int [] insertionSort(int arr[],int arrSize)
	{
		int index=1,count,temp;
		while(index<arrSize)
		{
			temp = arr[index];
			count = index;
			while(count >=0 &&  temp <= arr[count-1])
			{
				arr[count] = arr[count-1];
				count--;
			}
			arr[count] = temp;
			index++;
		}
		
		/*for(int i = 0; i<arrSize;i++)
		{
			System.out.printf(arr[i]+" ");
		}*/
		return arr;
		
	}
	
	
	//Selection sort method
	public int[] selectionSort(int arr[],int arrSize)
	{
		int index=0,indexSmallest,temp,count;
		while(index<arrSize)
		{
			indexSmallest = index;
			count = index+1;
			while(count<arrSize)
			{
				if (arr[count] < arr[indexSmallest])
				{
					indexSmallest = count;
				}
				count++;
			}
			temp = arr[index];
			arr[index] = arr[indexSmallest];
			arr[indexSmallest]=temp;
			index++;
		}
		/*for(int i = 0; i<arrSize;i++)
		{
			System.out.printf(arr[i]+" ");
		}*/
		return arr;
	}

}
