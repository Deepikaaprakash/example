package overriding;

public class Test 
{
	public static void main(String[] args) 
	{
		IseBranch branch = new IseBranch();
		CseBranch cseBranch = new CseBranch();
		EceBranch eceBranch = new EceBranch();
		System.out.println(branch.fees());
		System.out.println(cseBranch.fees());
		System.out.println(eceBranch.fees());
	}
}
