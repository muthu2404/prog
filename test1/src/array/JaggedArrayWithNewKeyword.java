package array;

public class JaggedArrayWithNewKeyword {
public static void main(String[] args) {
	int[]x= {10,20,30,40};
	int[]y= {40,50,60};
	int[]z= {70,80,90};
	
	int[][] a=new int[3][3];
	a[0]=x;
	a[1]=y;
	
	for(int[]i:a)
	{
		for(int b:i)
		{
			System.out.print(b+" ");
		}
		System.out.println();
	}
}
}
