package stringPractice;

public class CountVowels {
	public static void main(String[] args) {
		String s="Himalaya";
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j = 0;j<s.length();j++)
			{
				
			
			if(s.charAt(i)==s.charAt(j)&&(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'))
			{
				count++;
				
			}
			
			}
		if(count>0&&(s.indexOf(s.charAt(i))==i))
		{
			System.out.println(s.charAt(i)+"====="+count);
		}
		
			
	}
		
}
}