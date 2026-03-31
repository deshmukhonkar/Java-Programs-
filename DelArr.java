/*Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5
*/


import java.util.*;
class ArrOpe
{
 public void delEle(int a[],int dk)
 {
	 if (dk < 1 || dk > a.length) {
            System.out.println("Invalid position!");
            return;
        }

  for(int i=dk-1;i<a.length-1;i++)
  {
	 a[i]=a[i+1];
  }
  
  System.out.println("After Deletion");
  for(int i=0;i<a.length-1;i++)
  System.out.println(a[i]);
  
 }
}

public class DelArr
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
   
   System.out.println("Enter the index position to delete an element");
   int  dkey = xyz.nextInt();
   ArrOpe ao = new ArrOpe();
   ao.delEle(a,dkey);
 
 }
}