/*Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest)
*/

import java.util.*;
class SecondLarge
{
 public void SecL(int a[])
 {
  int largest = a[0];
  int secondLargest = -1;
   for(int i=0;i<a.length;i++)
   {
    if(a[i]>largest )
	{
	 secondLargest= largest;
	 largest =a[i];
	}
    else if(a[i]>secondLargest && secondLargest!=largest )
	{
	 secondLargest =a[i];
	}
   }
   
   System.out.println("Largets ELement "+ largest);
   System.out.println("Second Largets ELement "+ secondLargest);
 }
}

public class SecLargeArr
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
   SecondLarge sl = new SecondLarge();
   sl.SecL(a);
 }
}