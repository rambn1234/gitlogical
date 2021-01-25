package Logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HigestNumberFinding {

	
	
	
	public static void main(String[] args) {
		
  // find array high number  
	int arr[]= {10,25,5};
	int max =arr[0];
 
	for(int i=0;i<arr.length;i++)   
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
		System.out.println(max);
	
	
	
	
	
		
	Arrays.sort(arr);
	for (int i : arr) {
		System.out.println(i);
	}

	
System.out.println("high number of array="+arr[arr.length-1]);	


ArrayList al1=new ArrayList();
al1.add(456);
al1.add(100);
al1.add(20);	
al1.add(45);
al1.add(200);
System.out.println(al1);


System.out.println(Collections.max(al1));
	// ArrayList Sort By Collections.sort()Method then Find high number 
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(100);
	al.add(105);
	al.add(55);
	al.add(12);
	
	System.out.println(al);
    Collections.sort(al);
    System.out.println(Collections.max(al));
    
    System.out.println(al);
    System.out.println(al.get(al.size()-1));//  find high number // ArrayList Have al.get(index) Method
   

    
    
    
    
    
    
    
    Set<Integer> s1=new HashSet();
    
    s1.add(54);
    s1.add(86);
    s1.add(78);
    s1.add(55);
    Collections.min(s1);
    s1.size();
    //Collections.sort(s1); // no method 
      System.out.println(Collections.min(s1));
      
      Set<Integer> set=new TreeSet<Integer>();
      set.addAll(s1);
      set.forEach(System.out::println);
    
    
    
	}
}



