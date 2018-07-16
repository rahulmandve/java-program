package StringProgram;

public class AlternateCharUppCase {
	public String upperCase(String s)
	{

	for(int i=0;i<s.length();i++)
	{
		if(i%2==0)
		{
			char c=s.charAt(i);
			System.out.print(Character.toUpperCase(c));
		}else{
			char c=s.charAt(i);
			System.out.print(Character.toLowerCase(c));
		}
	
	}
	return s;
	
	}
	public static void main(String[] args) {
		AlternateCharUppCase a=new AlternateCharUppCase();
		a.upperCase("rahul");
	}

}
