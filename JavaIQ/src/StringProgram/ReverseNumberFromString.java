package StringProgram;

public class ReverseNumberFromString {
public static void main(String[] args) {
	String s="sd15ds98";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		char c=s.charAt(i);
		if(Character.isDigit(c))
		{
			System.out.print(c);
		}
				
	}
}
}
