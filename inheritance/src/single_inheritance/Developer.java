package single_inheritance;

public class Developer extends Employee
{
	double bonus=900;
	
	public void total()
	{
		double t=bonus+salary;
		System.out.println(t);
	}
	@Override
	public String toString() {
		return "Developer [bonus=" + bonus + ", id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
