/*Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:

	12 14 18 20 22 25 27 0 3  6 9
*/

import java.util.*;
public class NRotArr
{

  public static void rotateone(int a[])
  {
   int temp = a[0];
   for(int i=1;i<a.length;i++)
   {
    a[i-1]=a[i];
   }
   a[a.length-1]= temp;
  
  }
  public static void rotateArr(int a[],int k)// k= 3 n = 5 1%5 = 1, 2 = 2, 3  = 3 , 4 = 4 , 5 = 0 ,6 = 1
  {
	  k=k%a.length;
	  if(k<0)
	  {
		  k= k+a.length;
	  }
	  for(int i= 1;i<=k;i++)
  {
	  rotateone(a);
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
   
   System.out.println("Enter K for rotation");
   int k = xyz.nextInt();
   
  rotateArr(a,k);
  for(int i=0;i<a.length;i++)
   { System.out.print(a[i]+" ");
   }
 }
}