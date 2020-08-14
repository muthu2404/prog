package array;

import java.util.Scanner;

public class UsingScannerforSingleDimension {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size  of array");
	int size = scan.nextInt();
	int x[]=new int [size];
	System.out.println("Enter data into array");
	for(int i =0;i<size;i++)
	{
		x[i]=scan.nextInt();
	}
	
	for(int i:x)
	{
		System.out.println(i);
	}
}
}
