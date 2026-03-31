/* Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
*/

import java.util.*;
public class MissArr
{
 public static void main (String x[])
 {
   
   Scanner xyz = new Scanner(System.in);
   
 int a[] = {1, 2, 4, 5, 7};
  int n = 7;
  
   for(int i=1;i<=7;i++)
   {
    boolean found = false;
    for(int j=0;j<a.length;j++)
	{
	 if(a[j]==i)
	 {
	 found = true;
	 break;
	}
	}
	
	if(!found)
	{
	 System.out.println("Missing Element "+ i);
	}
   }
   
   
 
 }
}