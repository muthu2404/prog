package arrayPractice;

public class arrayReverse {
	public static void main(String[] args) {
		int[]x= {12,15,8,7,20,22};
		int[]rev=new int[x.length];
		int count=0;
		for(int i=x.length-1;i>=0;i--)
		{
			rev[count]=x[i];
			count++;
		}
		
		for(int i:rev)
		{
			System.out.println(i);
		}
	}
}
