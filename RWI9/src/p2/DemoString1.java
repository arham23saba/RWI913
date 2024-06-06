package p2;

public class DemoString1 {

	public static void main(String[] args) 
	{
		String s1 = "nit";
		String s2 = new String("hyderabad");
		
		System.out.println("***** s1 ******");
		System.out.println("data in string:"+s1.toString());
		int l1 = s1.length();
		System.out.println("length of s1:"+l1);
		char ch1 = s1.charAt(0);
		System.out.println("char at index 0:"+ch1);
		
		System.out.println("***** s2 ******");
		System.out.println("data in string:"+s2.toString());
		int l2 = s2.length();
		System.out.println("length of s2:"+l2);
		char ch2 = s2.charAt(5);
		System.out.println("char at index 5:"+ch2);

	}

}
