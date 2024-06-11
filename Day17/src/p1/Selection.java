package p1;

public class Selection 
{
	public void select(int n1,String name)
	{
		if(n1<=Availaible.a1)
		{
			System.out.println(n1+" Tickets booked for "+name);
			Availaible.a1=Availaible.a1-n1;
		}
		else
		{
			System.out.println("Sorry,Tickets not Availaible.."+name);
		}
	}

}
