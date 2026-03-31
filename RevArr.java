/*Q2. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/


import java.util.*;
public class RevArr
{
	public static void reverese(int a[],int start, int end)
	{
		while(start < end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
	}
 public static void main (String x[])
 {
   
   Scanner xyz = new Scanner(System.in);
   
   System.out.println("Enter the  size of an Array");
   int n = xyz.nextInt();
   
   int a[] = new int [n]; 
   
   System.out.println("Enter elements in an Array");
   
   for(int i=0;i<a.length;i++)
   {
    a[i] = xyz.nextInt();
   }
   
   reverese(a,0,n-1);
   for(int i=0;i<a.length;i++)
   {
	   System.out.print(a[i]+" ");
   }
 }
}