package p2;
import java.util.Scanner;

public class DemoString2 {

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		try(s;){
		 System.out.println("Enter the string:");
		 String s1 = s.nextLine();
		 int l1 = s1.length();
		 int count=0;
		 for(int j=0;j<=l1-1;j++)
		/*{
		
			char ch1 = s1.charAt(j);
			if(ch1=='a'|| ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
			{
				count++;
				
			}
		
		}*/
	    {
			char ch=s1.charAt(j);
			switch(ch)
			{
			 case 'A':
			 case 'a':
				 count++;
				 break;
			 case 'E':
			 case 'e':
				 count++;
				 break;
			 case 'I':
			 case 'i':
				 count++;
				 break;
			 case 'O':
			 case 'o':
				 count++;
				 break;
			 case 'U':
			 case 'u':
				 count++;
				 break;
			}
		}
		System.out.println("count of vowels :"+count);
		s.close();
		}
		

	}

}
