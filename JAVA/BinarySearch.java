import java.io.*;
import java.util.*;

class BinarySearch{
public static int binarySearch(int[] arr,int n,int ele)
{
	int s=0,e=n-1;
	int mid=s+(e-s)/2;
	while(s<=e)
	{
		if(arr[mid]==ele)	return mid;
		else if(arr[mid]>ele)	e=mid-1;
		else			s=mid+1;
		mid=s+(e-s)/2;
	}
	return -1;
}
public static void main(String[] args)
{
Console c=System.console();
int n=Integer.parseInt(c.readLine("enter n: "));
int arr[]=new int[n];

for(int i=0;i<n;i++)
	arr[i]=Integer.parseInt(c.readLine("enter element: "));


for(int i=0;i<n;i++)
	System.out.println(arr[i]);

int ele=Integer.parseInt(c.readLine("enter element you want to search: "));
int pos=binarySearch(arr,n,ele);
if(pos!=-1)		System.out.println("element "+ele+" found at index "+pos);
else			System.out.println("element not found!");
}
}