package arrayPractice;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		int[]x= {12,15,8,7,20,22};
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = s.nextInt();
		Boolean flag=false;
		for(int i:x)
		{
			if(num==i)
			{
				flag=true;
				break;
				
			}
			
		}
			if(flag=true)
			{
				System.out.println(num+"is   present");
			}
			else {
				System.out.println(num+"is  not present");

			}
		}
		
		

	}

