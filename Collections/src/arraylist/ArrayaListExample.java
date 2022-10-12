package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayaListExample
{
	public static void main(String[] args) 
	{
		ArrayList< String > arrayList = new ArrayList<String>();
		arrayList.add("Mango");
		arrayList.add("Orange");
		arrayList.add("Apple");
		arrayList.add("Banana");
		Iterator itr = arrayList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
