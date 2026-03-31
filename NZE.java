/* Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.
*/


import java.util.*;
public class NZE
{
 public static void main (String x[])
 {
 
   int a[] = {1, 0, 5, 0, 7, 0, 9};
   
   for(int i=0;i<a.length;i++)
   {
    if(a[i]!=0)
	{
	 System.out.printf("%d\t",a[i]);
	}
   }
  
 }
}