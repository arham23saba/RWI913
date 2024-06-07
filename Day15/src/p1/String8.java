package p1;
import java.util.*;

public class String8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the string:");
			String str = s.nextLine();
			int c1=0;
			int c2=0;
			int len = str.length();
			for(int i=0;i<=len-1;i++)
			{
				char ch = str.charAt(i);
				if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||
						ch=='O'||ch=='o'||ch=='U'||ch=='u')
				{
					c1++;
				}
				else
				{
					c2++;
				}
			}
			System.out.println("Number of Vowels:"+c1);
			System.out.println("Number of Consonants:"+c2);
		}

	}

}
