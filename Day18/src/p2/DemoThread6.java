package p2;
import java.util.Date;

public class DemoThread6 {

	public static void main(String[] args) 
	{
		new Thread(new Runnable()
		{
				public void run()
		  {
			for(int i=1;i<=5;i++)
			{
				System.out.println("Bob....Login..."+new Date());
				try {
					Thread.sleep(2000);	
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		  }
		  }).start();
		new Thread(new Runnable()
		{
				public void run()
		  {
			for(int i=1;i<=5;i++)
			{
				System.out.println("Alex....Login..."+new Date());
				try {
					Thread.sleep(2000);	
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		  }
		  }).start();
	 

	}

}
