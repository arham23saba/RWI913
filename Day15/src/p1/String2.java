package p1;

public class String2 {

	public static void main(String[] args) {
		String s2= "RailWorld";
		String revstr="";
		char ch;
		for(int i=0;i<s2.length();i++)
		{
		 ch=s2.charAt(i);	
		 revstr=ch+revstr;
		}
		 System.out.print(revstr);

	}

}
