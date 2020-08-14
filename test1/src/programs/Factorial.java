package programs;

import java.util.Scanner;

public class Factorial {
	int count=1;
	int fact=1;
	int num;


	public static void main(String[] args) {
		Factorial f = new Factorial();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		f.num = s.nextInt();
		 f.m1();
		 System.out.println(f.fact);
		}
	public   void m1()
	{
	
	
	if (count<=num)
	{
	
		fact=fact*count;
		count++;
		m1();
		
		
	}
}
}
