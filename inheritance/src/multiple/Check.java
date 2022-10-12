package multiple;

public class Check implements Printable,Showable
{

	@Override
	public void show() 
	{
		System.out.println("Im showing!!");
	}

	@Override
	public void print() 
	{
		System.out.println("Im printing!!");
	}

}
