package etoday;
import java.util.Scanner;
class BubbleSorting {
	public void sortingMethod(int[] array1) {
		for (int index=0;index<array1.length;index++) {
			for (int index2=0;index2<(array1.length-1-index);index2++) {
				if (array1[index2] > array1[index2 + 1])
				{
					int temp = array1[index2];                      
					array1[index2]=array1[index2 + 1];
					array1[index2+1]=temp;               
				}
			}
		}
		System.out.printf("Sorted Array elements are :");
		for (int index=0; index<array1.length;index++) 
		{
			System.out.printf(" %d ", +array1[index]);
		}

	}
}
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		BubbleSorting sort = new BubbleSorting();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size Here : ");
		int size = sc.nextInt();
		int[] array1 = new int[size];
		System.out.println("Enter array elements : ");
		for (int index=0;index<size;index++)
		{
			array1[index] = sc.nextInt();
		}
		System.out.printf("Array Elements you entered are :");
		for (int index = 0;index<array1.length;index++)
		{
			System.out.printf(" %d ", array1[index]);
		}
		System.out.println();
		sort.sortingMethod(array1);
	}

}
