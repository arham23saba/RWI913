package p1;


public class String3 {

	public static void main(String[] args) {
		
		String s1="MALAYALAM";
		String s2="";
		char ch;
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			s2=ch+s2;
		}
		if(s1.equals(s2))
		{
			System.out.println("its a PALLINDROME");
		}
		else
		{
			System.out.println("its a NOT PALLINDROME");
		}

	}

}
