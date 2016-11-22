package functions;

import java.io.IOException;

public class FunctionEg {

	public static void main(String[] args) throws IOException 
	{
		BasicFunctions s=new BasicFunctions();
//		
//		System.out.println(s.url);
//		
//		s.function1();
		
//		FunctionEg fe=new FunctionEg();
//		int result=fe.sum(30, 50);
//		System.out.println(result);
		
//		System.out.println(BasicFunctions.url);
		
		s.Launch("http://gmail.com");
		s.Takes_Screenshot(s.driver, "gmail");
	}
	
	
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}

}
