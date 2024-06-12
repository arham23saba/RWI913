package src.p1;

public class Select 
{
  public synchronized static void select(int n,String name)  //class locking
  {
	 if(n<=Availaible.al)
	 {
		 System.out.println(n+" Tickets booked for "+name);
		 Availaible.al=Availaible.al-n;
	 }
	 else
	 {
		System.out.println("Sorry no tickets availaible.."+name); 
	 }
  }
}
