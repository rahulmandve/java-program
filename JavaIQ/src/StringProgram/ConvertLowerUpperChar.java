package StringProgram;

import java.util.Scanner;

public class ConvertLowerUpperChar {
	
	public String data(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				System.out.print(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch)){
				System.out.print(Character.toUpperCase(ch));
			}
		}
		return s;
	}
	public static void main(String[] args) {
		ConvertLowerUpperChar s=new ConvertLowerUpperChar();
		String str;
		Scanner sc=new Scanner(System.in);
		
		str=sc.nextLine();
		s.data(str);
		
	}

}
