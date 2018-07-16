package StringProgram;

public class SeprateCharFromString {
public static void main(String[] args) {
	//int len=0;
	String s="R12A89HU0L";
	/*	char []a=s.toCharArray();
	
	for(char c:a)
	{
		len++;
	} */
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(Character.isLetter(c))
		{
			System.out.print(c);
		}
		
	}
	System.out.println();
	for(int j=0;j<s.length();j++)
	{
		char c=s.charAt(j);
		if(Character.isDigit(c))
		{
			System.out.print(c);
		}
				
	}
}
}
