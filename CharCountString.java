package Logical;

public class CharCountString {
public static void main(String[] args) {
	
	
	String s="Ramchandra";
	
	s=s+'\n';
	
	int count=0;
	for(int i=0;s.charAt(i)!='\n';i++)
	{
		count++;
	}
	
	System.out.println(count);
}
}
