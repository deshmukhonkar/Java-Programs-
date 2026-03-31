/*
Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if an element already exists before adding to the result, thus avoiding duplicates.
*/

import java.util.*;
public class UnqArr
{
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
   
   for(int i=0;i<a.length;i++)
   {
	 boolean isDuplicate = false;
	 
    for(int j=0;j<i;j++)
	{
	  if(a[i]==a[j])
	  {
	    isDuplicate = true;
		break;
	  }
	}
	if(!isDuplicate)
	{
		System.out.println(a[i]);
	}
   }
 }
}