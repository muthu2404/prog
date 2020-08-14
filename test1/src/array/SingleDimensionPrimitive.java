package array;

import java.util.Arrays;

public class SingleDimensionPrimitive {
public static void main(String[] args) {
	
	//declaration with new keyword
	int x [] = new int[3];
	//declaration without new
	int s[]= {10,20,30};
	
	x[0]=30;
	x[1]=20;
	x[2]=10;
	
	System.out.println(x[1]);
	System.out.println(s[2]);
	Arrays.sort(x);
	for(int i: x)
	{
		System.out.println(i);
	}
	
	
	
	
}
}
