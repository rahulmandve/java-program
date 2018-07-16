package Patterns;

public class P2 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		if(i%2==0)
		{
		for(int s=1;s<=i;s++)
		{
			System.out.print(i);
		}
		}else{
			for(int s=1;s<=i;s++)
			{
				System.out.print("*");
			}	
		}
		System.out.println();
	}
}
}
