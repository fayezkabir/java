package calculator;

public class Calculateclass {
	int x=20;
	int y=5;
	int result=0;
	public void add()
	{int result=(x+y);
		System.out.println("result="+result);
	} 
	public void sub()
	{
		int result=(x-y);
		System.out.println("result="+result);
	}
	public void div()
	{
		int result=(x/y);
		System.out.println("result="+result);
	}
	public void mult()
	{
		int result=(x*y);
		System.out.println("result="+result);
	}

	public static void main(String[] args) {
		Calculateclass cu=new Calculateclass();
		cu.sub();
		
		// TODO Auto-generated method stub

	}

}
