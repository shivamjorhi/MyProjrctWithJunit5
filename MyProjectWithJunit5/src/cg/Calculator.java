package cg;

public class Calculator {
	public int add(int a, int b)
	{
		int res=0;
		if(a>=0 && b>=0)
		{
			res = a+b;
		}
		return res;
	}

	public int idgeneration() {
		 int no=(int) (Math.random()*1000);
		return no;
	}

}
