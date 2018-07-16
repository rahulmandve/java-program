package Patterns;

public class P5 {
	public static void pattern()
	{
		char n='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
			
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
	}
public static void main(String[] args) {

	P5.pattern();
}
}
