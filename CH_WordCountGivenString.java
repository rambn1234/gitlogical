package Logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CH_WordCountGivenString {

	
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> hm=new HashMap<>();
		
		String s="I am ram welcome to java ram welcome";
	
		
		String str[] =s.split(" ");
		
	//	System.out.println(str); // print string array address
		for( String tempstring : str)
		{
			//System.out.println("GetMethod="+hm.get(tempstring));
	
			if(hm.get(tempstring)!=null)            // hm.get(tempstring) manje hm.get(key);  method return value of that passed key in get method .                          
			{
				hm.put(tempstring, hm.get(tempstring)+1);
			}
			
			else
			{
				hm.put(tempstring,1);
			}
	        
			
			//System.out.println(tempstring);
		}
		System.out.println(hm);
		
	    Set st=hm.keySet();// return set of key
	    
	    Iterator itr=st.iterator();
		
	    while(itr.hasNext())
	    {
	    	String ts=(String)itr.next();
	    	
	    	if(hm.get(ts)>1)
	    	{
	    		System.out.println(ts+"="+hm.get(ts));
	    	}
	    }
	    
	    
	}
}
