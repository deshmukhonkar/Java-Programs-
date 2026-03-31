/*Q1. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/

import java.util.*;

public class SearchArr
{

public  int searchElement(int a[],int skey)
{
boolean fd = false;
for(int i=0;i<a.length;i++)
{ 
 if(skey== a[i])
 {
   fd = true;
   break;
 }
}
if(fd)
   {
    System.out.println("Found");
   }
   else
   {
    System.out.println("Not Found");
   }
return 1;
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
    
	System.out.println("Enter the search key ");
int skey = xyz.nextInt();

    SearchArr obj = new SearchArr();
	obj.searchElement(a,skey);
	
   
 }
}