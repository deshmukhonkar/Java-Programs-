/*Write a program in java to insert an element at desired position from an array.
	Test Data :
	Input the size of array : 6
	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	Input the position where to insert : 2
	Value :      200
	Expected Output : The new list is : 1 2 200 3 4 5
*/

import java.util.*;

class InsertElement
{
  public void arr(int a[],int pos, int value,int n )
  {
   for (int i = n - 1; i >= pos; i--) { 
            a[i + 1]=a[i];
        }
        a[pos] = value;
		
    for(int i=0;i<=n;i++)
	{
	 System.out.print(a[i] + " ");
	}
  }
}
public class InsEleArr
{
 public static void main (String x[])
 {
   Scanner xyz = new Scanner(System.in);
   
   System.out.println("Enter the  size of an Array");
   int n = xyz.nextInt();
   
   int a[] = new int [n+1];//6
   
   System.out.println("Enter elements in an Array");
   
   for(int i=0;i<n;i++)// n= 5 n+1 = 6 
   {
    a[i] = xyz.nextInt();
   }
   
   System.out.println("Enter Position");
   int pos = xyz.nextInt();
   
   System.out.println("Enter Value");
   int val = xyz.nextInt();
   
   InsertElement ie = new InsertElement();
   ie.arr(a,pos,val,n);
   
 }
}