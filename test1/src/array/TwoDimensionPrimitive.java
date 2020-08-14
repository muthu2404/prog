package array;

import java.util.Scanner;

public class TwoDimensionPrimitive {
public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter row and column");
	int row = s.nextInt();
	int col = s.nextInt();
	int x[][]=new int [row][col];
	System.out.println("Enter data's");
	for(int i= 0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			x[i][j]=s.nextInt();
		}
	}
	for(int i[]:x)
	{
		for(int a:i)
		{
			System.out.print(a+" ");
		}
		System.out.println();
	}
}
}
