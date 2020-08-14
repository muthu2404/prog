package programs;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int  temp=num;
		int count=0;
		int rem;
		
		while(num>0)
		
			
			{
				rem=num%10;
				count=(rem*rem*rem)+count;
				num=num/10;
			}
			
		
		if(count==temp)
		{
			System.out.println("the number is Armstrong");
		}
		else
		{
			System.out.println("not armstarong");
		}
	}
	
}
