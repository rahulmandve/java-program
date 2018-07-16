package StringProgram;

public class SumOfDigitInString {

	public static void main(String[] args) {
		String s="a2sd5f6";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
				sum=sum+Integer.parseInt(String.valueOf(c));
			}
		}
		System.out.println(sum);
	}
}
