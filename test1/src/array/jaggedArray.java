package array;

public class jaggedArray {
	public static void main(String[] args) {
		int[]x= {10,20,30};
		int[]y= {40,50,60};
		int[]z= {70,80,90};
		
		int [][]a= {x,y,z};
		
		for(int i[]:a)
		{
			for(int b:i)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	
}
}