package Numbers;

public class PrimeNumber {
	public static void main(String[] args)
	{
		int n=5,count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				{
					count++;
				}
		}
		if(count==2)
		{
			System.out.println("Number is prime Number");
		}else{
			System.out.println("Not prime Number");
		}
}
}