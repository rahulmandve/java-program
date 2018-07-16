package Patterns;

public class P1 {
	
public static void main(String[] args) {
	int n=10;
	for(int i=1;i<=5;i++)
	{
		n=n*10;
		/*for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}*/
		for(int s=1;s<=i;s++)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
}
