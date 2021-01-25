package Logical;

import java.util.Arrays;

public class FiendHigestSecound {
public static void main(String[] args) {
	
	
	  // find array  High secound by Sort() Method   
		int arr[]= {10,25,5,45,17,35};
	
		Arrays.sort(arr);
	System.out.println(arr[arr.length-2]);
	
	int temp;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	System.out.println("Secound Higest Number="+arr[arr.length-2]);
	
		for (int i : arr) {
			System.out.println(i);
		}
		
	
		
		
		
		
		
		
		
		
}
}
