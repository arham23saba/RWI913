package p1;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1= s.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			count++;
		}
		System.out.println("count:"+count);
	}

}
