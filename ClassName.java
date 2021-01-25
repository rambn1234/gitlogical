package Logical;

public class ClassName {

	public static void main(String[] args) {
		
		
		int arr[]= {10,20,30,40,50};
		
		Class c=arr.getClass();
		String s=c.getName();
		
		System.out.println(c);
		
		System.out.println(s);
		
		
		ClassName ob1=new ClassName();
		
		Class c1=ob1.getClass();
		System.out.println(c1);
		
		String s1=c1.getName();
		System.out.println(s1);
	}
}
