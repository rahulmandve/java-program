package StringProgram;

public class ReplaceDigitWithStaar {
public static void main(String[] args) {
	String s="R255AH0U12L";
	
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(Character.isLetter(c))
		{
			System.out.print(c);
		}
		else{
			System.out.print("*");
		}
	}
}
}
