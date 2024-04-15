package mypackage;

public class factorial {

	public static void main(String[] args) {
		//1. Factorial using recursive function
		//2.  Sum of all natural numbers using recursive function

		int factorial= fact(10);
		System.out.println(factorial);
		
		
		int number = AddNum(5);
		System.out.println("Sum of all nos till given number: " + number);
	}
	
	public static int fact(int num) {
		if (num==0)
			return 1;
		else 
		{
			int abc= num * fact(num-1);
			return abc;
		}}
		
	
	public static int AddNum(int numb)
	{
		if(numb!=0)
		
		numb = numb + AddNum(numb-1);
		
		return numb;
		
		
	}
	

}
