package stringPractice;

public class OccuranceOfOddPlaces {
		public static void main(String[] args) {
			String s="iamgoodboy";
			for(int i =0;i<s.length();i++)
			{	int count=0;
				for(int j = 0;j<s.length();j++)
				{
					
					if(s.charAt(i)==(s.charAt(j))&&((i)%2==0)&&((j)%2==0))
					{
						count++;
						
					}
					
				}
				if(count>0)
				System.out.print(s.charAt(i));
			}
		}
}
