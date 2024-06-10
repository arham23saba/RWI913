package p1;

import java.util.Scanner;

@SuppressWarnings("serial")
public class Exception2 extends Exception {
	
	public Exception2(String msg)
	{
		super(msg);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		try {
		 System.out.println("Enter the Marks:");
		 int mk = Integer.parseInt(s.nextLine());
		
		 if(mk<0 || mk>100)
		 {
			Exception2 de = new Exception2("Invalid marks");  //user defined
			throw de;
		 }
		 if(mk<35 )
		 {
			Exception2 de = new Exception2("Fail..");
			throw de;
		 }
		 System.out.println("Passed with marks:"+mk);
		 }
		catch (NumberFormatException nfe)
		{
			System.out.println("Enter the number in Integer format-"+nfe.getMessage());
		}
		 catch (Exception2 de)
		{
			System.out.println(de.getMessage());
		}
		s.close();

	}

}
