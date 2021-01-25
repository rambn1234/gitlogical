package Logical;

public class ReverceString {
public static void main(String[] args) {
	
	
	String s1="Ramchandra";
    String s2="";
     int length=s1.length();
     for(int i=length-1;i>=0;i--)
     {
    	 s2= s2 + s1.charAt(i);
    	 System.out.println(s2.hashCode()); // it mince every time new object create of every concatinate  operation .
     }
     System.out.println(s2);
}
}
