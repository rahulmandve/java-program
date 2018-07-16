package StringProgram;

public class OccernceOfCharInString {
public static void main(String[] args) {
	String s="hello world";
	char ch='l';
	int cnt=0;
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(Character.isLetter(c))
		{
			if(ch==c)
			{
				cnt++;
			}
		}
	}
	System.out.println("L occernce in Given String id=="+cnt);
}
}
