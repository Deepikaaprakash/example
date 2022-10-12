package threadsexample;

public class Demo extends Thread
{
	public void run()
	{
		int a=2;
		int b=3;
		int result=a+b;
		System.out.println("Thread started running");
		System.out.println("The result is:"+ result);
	}
	
	public static void main(String[] args)
	{
		Demo demo = new Demo();
		demo.start();
	}
}
