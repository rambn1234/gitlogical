package Logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class WordCount {
public static void main(String[] args) {
	

	
	String s="java programing lang welcome to java welcome";
	
	HashMap<String, Integer> hm=new HashMap();
	
	String str[]=s.split(" ");

	for(String sl : str)
	{
		
		if(hm.get(sl)!=null)
		{
			hm.put(sl, hm.get(sl)+1);
		}
		else {
			hm.put(sl, 1);
		}
	}
	System.out.println(hm);
	
	Set st=hm.keySet();
	
	Iterator itr=st.iterator();
	while(itr.hasNext())
	{
		
		String ss=(String)itr.next();
		
		if(hm.get(ss)>1)
		{
			System.out.println(ss+"="+hm.get(ss));
		}
	}
	
}
}
