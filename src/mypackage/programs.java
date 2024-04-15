package mypackage;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class programs {

	public static void main(String[] args) {
		// 1. Reverse a string

		String s= "this is Automation";
		int a= s.length();
		String rev = "";
		for(int i =a-1;i>=0;i--)
		{
			
			rev= rev + s.charAt(i);
		}
		System.out.println(rev);
		
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Using string buffer: "+ sb.reverse());
		
		// 2. Remove junk character from string
		
		String st = "@# Software ^^%$^&Testing";
		
		st = st.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("Removed junk char : "+st);
		
		//3. Reverse an integer
		
		int abc= 12345;
		
		int reverse = 0;
		
		while(abc!=0)
		{
		
			reverse = (reverse *10)+ (abc %10);
			abc = abc/10;
		}
		System.out.println("Reversed number is : "+reverse);
		
		
		//Using stringbuffer
		int n= 1552;
		String ss = String.valueOf(n);
		
		StringBuffer pq= new StringBuffer(ss);
		StringBuffer t= pq.reverse();
		System.out.println("Reverse integer using string buffer : "+t);
		int x= Integer.parseInt(String.valueOf(t));
		System.out.println("Converted to integer: "+x);
		
		//convert a string to boolean
		String g= "true";
		boolean b = Boolean.parseBoolean(g);
		System.out.println(b);
		
		//4. find duplicate in array
		
		String name[]= {"Java", "PHP","Python","C", "Java", "Ruby", "Python" };
		
		for (int i=0; i<name.length; i++)
		{
			for (int j=i+1; j<name.length;j++)
				
				
			{
				if (name[i].equals(name[j]))
					System.out.println("Duplicate is : "+ name [i]);
			}
		}
		
		//using hashset class of interface Set
		
		
		String names[]= {"Java", "PHP","Python","C", "Java", "Ruby", "Python" };
		Set<String> store = new HashSet<String>();
		for(String so :names)
		{
			if(store.add(so)==false)
				System.out.println("Duplicate value is : "+ so);
		}
	
		//5. find smallest and largest no in array
		
		int numb[] = {-12,77,13,0,151,-111};
		
		int largest = numb[0];
		int smallest = numb[0];
		
		for(int i=1; i<numb.length; i++)
		{
			if (numb[i]< smallest)
			smallest= numb[i];
				
			else if (numb[i]>largest)
				largest= numb[i];
		}
		
		
		System.out.println("Smallest is : "+ smallest);
		System.out.println("Largest is : "+ largest);
		
		
		//6. swap strings in given 2 variables
		
		String aa= "Hello";
		String bb = "World";
		
		aa= aa+bb;
		System.out.println(aa);
		bb= aa.substring(0,aa.length()-bb.length());
		System.out.println("bb is : "+bb);
		aa= aa.substring(bb.length());
		System.out.println("aa is : "+aa);
		
		//7. given no is prime or not
		
		int number = 13;
		int count = 0;
		for(int i =1; i<=number; i++)
		{
			if (number%i==0)
				count ++;
		}
		if (count ==2)
		{
			System.out.println ("number is prime");
		}
		else
			System.out.println ("number is not prime");
		
	//8. find all prime nos till given no
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Find all prime till given number. Enter number");
		int numbb = sc.nextInt();
		
		int countt = 0;
		
		for(int p =1; p<=numbb; p++)
		{
			for (int q =1; q<=p;q++)
			{
				if(p%q==0)
					countt++;
			}
		if(countt==2)
			System.out.println( p + "The number is prime");
		
		countt=0;
		}	
		
		//8. find if number is armstrong number
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find if armstrong:");
		int arm = scan.nextInt();
		int cube = 0;
		int ti= arm;
		while(arm!=0)
		{
			int r = arm%10;
			arm = arm/10;
		
		cube = cube +r*r*r;
		}
		if (ti==cube)
			System.out.println("Number is armstrong number");
		else
			System.out.println("Number is not armstrong number");
		
		
		//9. find the factorial of a number 
		
		int w= 6;
		if (w==0)
			System.out.println("Factorial of 0 is 1");
		else
		{
		int fact=1;
		for (int i=w; i>=1; i--)
		{
			
			fact = fact *i;
		}
		System.out.println("Factorial is: "+fact);
		}
		
		//10. factorial using recursive function
		
		fact(10);
	}
public static int fact(int num)
{
	if (num==0)
		{
		System.out.println("Factorial is 1");
		return 1;
		}
	else
	{
		int abc = num * fact(num-1);
		System.out.println(abc);
		return abc;
	}
	
	
	
}
	
}




