package array;

public class TwoDimensionalWithoutNewKeyword {
	public static void main(String[] args) {
		int [][]x= {{10,20,30},{40,50,60}};
		for(int[] i:x)
		{
			for(int a:i)
			{
				System.out.print(a+" ");
			
			}
			System.out.println();
		}
	}
}
