/* Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.
*/



import java.util.*;
public class FreqArr
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
   
   int freq[] = new int[n];
   int visited = -1;
   
   for(int i=0;i<a.length;i++)
   {
    int count = 1;
	
	for(int j=i+1;j<a.length;j++)
	{
	 if(a[i]==a[j])
	 {
	  count++;
	  freq[j]= visited;
	 }
	}
	 if(freq[i]!=visited)
	 {
	  freq[i]= count;
	 }
   }
   
   for(int i=0;i<freq.length;i++)
   {
    if(freq[i]!=visited)
	 {
	  System.out.print(a[i]+" -->"+freq[i]+" \n");
	 }
   }
 }
}