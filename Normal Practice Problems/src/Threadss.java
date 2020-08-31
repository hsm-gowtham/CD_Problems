
class Hacker implements Runnable
{
	public void run()
	{
		try {
			for(int i=0;i<2;i++)
			{
				Thread.sleep(100);
				System.out.println(" "+Thread.currentThread().getName());
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception occured");
		}
	}
}
public class Threadss
{
    public static void main(String args[])  
    {    
    	Hacker obj=new Hacker();
    	Thread t=new Thread(obj,"Java");
    	Thread t1=new Thread(obj,"PHP");
    	t.start();
    	//t.join();
        t1.start();    
        
    }    
} 