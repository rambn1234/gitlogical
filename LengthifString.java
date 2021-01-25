package Logical;

public class LengthifString {
public static void main(String[] args) {
	
	
	String s1="Ramchandra";
	int count=0;
 s1=s1+'\n';
System.out.println(s1);
 for(int i=0;i<s1.length();i++)
 {
	 System.out.println(s1.charAt(i));
 }
 for(int i=0;s1.charAt(i)!='\n';i++)
 {
	 
count++;	 
 }
 
 System.out.println(count);
}
}
