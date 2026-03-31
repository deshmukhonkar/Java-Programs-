/*Write a java program to find common elements between two arrays.
Input:
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation:
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.
*/

import java.util.*;
public class SamEleArr
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
   
   int b[] = new int [n];
   
   System.out.println("Enter elements in a second Array");
   
   for(int i=0;i<b.length;i++)
   {
    b[i] = xyz.nextInt();
   }
   
   
   for(int i=0;i<a.length;i++)
   {
    
	for(int j=0;j<b.length;j++)
	{
	 if(a[i]==b[j])
	 {
	  System.out.println(a[i]+" ");
	  break;
	 }
	}
	
   }
 }
}