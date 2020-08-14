package programs;

public class Palindrome {
	public static void main(String[] args) {
		int num=121;
		int temp = num;
		int count=0;
		int rem;
		
		while(num>0)
		
		
			{
				rem=num%10;
				count=(count*10)+rem;
				num=num/10;
				
			}
		
		if(count==temp)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
