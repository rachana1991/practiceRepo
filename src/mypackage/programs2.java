package mypackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class programs2 {

	public static void main(String[] args) {
//10. fibonacii series upto nth number
		
		int num = 10;
		int t1=0;
		int t2=1;
		int sum;
		
		for (int i=1; i<=num; i++)
		{
			System.out.println(t1);
			sum = t1+t2;
			t1=t2;
			t2=sum;
		}
		
//11. print A to Z 
		
		for (char c = 'A'; c<='Z'; c++)
		{
			System.out.print(c);
			
		}
		
//12. find number of digits in a integer
		int number = 123456;
		int count =0;
		while (number!=0)
		{
			number = number /10;
			count ++;
		}
		System.out.println("");
		System.out.println("Number of digits are : "+count);

//13. find all factors of a number
		int numb = 60;
		System.out.println("All factors are: ");
		for (int i=1; i<=numb; i++)
		{
			if(numb%i==0)
			{
				
				System.out.println(i);
			}
		}
	
//14. find largest in 3 numbers
		
		int a= 1200;
		int b = 2200;
		int c = 400;
		
		if (a>b&& a>c)
		{
			System.out.println("a is greatest");
		}
		else if(b>c)
			System.out.println("b is greatest");
		else
			System.out.println("c is greatest");
		
//15. Find if 2 strings are anagrams
		
		String st1= "Li st en";
		String st2 = "S ilent";
		
		st1 = st1.replaceAll("\\s","");
		st2 = st2.replaceAll("\\s","");
		
		if(st1.length()!=st2.length())
		{
			System.out.println("The strings are not anagrams");
			
		}
		else
		{
			char c1[]= st1.toLowerCase().toCharArray();
			char c2[]= st2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("The strings are anagrams");
			}
			else
				System.out.println("The strings are not anagrams");
		}
		
//16. Find if 2 numbers are anagrams
		
		int x= 123;
		int y = 319;
		
	char ch1[]=	String.valueOf(x).toCharArray();
	char ch2[] = String.valueOf(y).toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	if(Arrays.equals(ch1, ch2))
	{
		System.out.println("The numbers are anagrams ");
	}
	else
		System.out.println("The numbers are not anagrams ");
	
	
	
//17. Find occurance of each character in a string - Hashmap
	
	String s ="test";
	
	Map<Character,Integer> hmap = new HashMap<Character, Integer>();
	
	char strarr[] = s.toCharArray();
	
	for (char i:strarr)
	{
		if(hmap.containsKey(i))
		{
			hmap.put(i, hmap.get(i)+1);
		}
		else
			hmap.put(i, 1);
	}
	System.out.println(s + ":"+ hmap);
	
//18. Find count of small and capital chars in string
	
	//using Character.isUppercase  method
	
	String strr= "There are 5 Pens & 15 Papers on the Table.";
	
	int uppercaseCount=0;
	int lowercaseCount=0;
	int digit=0;
	int splchar=0;
	
	int len = strr.length();
	
	
	for(int i =0; i<len; i++)
	{
		if(strr.charAt(i)!=' ')
		{
		
		if (Character.isUpperCase(strr.charAt(i)))
		uppercaseCount++;
		
		else if (Character.isLowerCase(strr.charAt(i)))
		lowercaseCount++;
		
		else if (Character.isDigit(strr.charAt(i)))
			digit++;
		else
			splchar++;
	}
	}
	System.out.println("The upper case count is:" +uppercaseCount );
	System.out.println("The lower case count is:" +lowercaseCount );
	System.out.println("The digit count is:" +digit );
	System.out.println("The special case char count is:" +splchar );
	
	
//Without using inbuilt functions - by converting to char array
	
	int capital = 0;
	int small=0;
	int dig =0;
	int sp=0;
	char[] ch = strr.toCharArray();
	
	for (char i: ch)
	{
		if(i>='A' && i<='Z')
			capital++;
		else if (i>='a' && i<='z')
			small++;
		else if (i>='0' && i<='9')
			dig++;
		else
			sp++;
	}
	
	System.out.println("The capital count is:" +capital );
	System.out.println("The small count is:" +small );
	System.out.println("The number count is:" +dig );
	
	System.out.println("The sp char count is:" +sp );
	

//19. Remove duplicate characters from a string- indexOf

	String stt = "abc abfgs axb cdef abcdef";
	
	String newStr= "";
	
	for (int i=0; i< stt.length(); i++)
	{
		char chh= stt.charAt(i);	
		if(newStr.indexOf(chh)==-1)
		{
		newStr= newStr+ chh;	
		}
	}
	System.out.println(newStr);

// 	using hashset
	
	String n= "abbcddppweurg abc";
	char [] cc= n.toCharArray();
	
	LinkedHashSet <Character> hs = new LinkedHashSet <Character>();
	for (char cha: cc)
	{
		hs.add(cha);
	}
	
	System.out.println(hs);
	
	//convert hashset result to string
	
	StringBuilder sb = new StringBuilder();
	for (char cy: hs)
		sb.append(cy);
	System.out.println(sb.toString()); //convert string builder to string
		
	
//20. Reverse each word in a string without changing position
	
	String sss= "My name is Rachana";
	//output = yM eman si anahcaR 
	
	String word[] = sss.split("\\s");
	String rev = "";
	for (String w : word)
	{
		StringBuilder stb = new StringBuilder(w);
		stb.reverse();
		rev = rev +stb.toString() +" ";
	}
	System.out.println(rev);
	
	
//21. Reverse the order of words in string
	
	String sst= "My name is Rachana";
	// Output = "Rachana is name My"
	
	String ww[] = sst.split(" ");
	String ans ="";
	for (int i = ww.length-1; i>=0; i--)
	{
		ans = ans + ww[i] + " ";
	}
   System.out.println(ans.trim());	
   
	
	
	
	
	
}}