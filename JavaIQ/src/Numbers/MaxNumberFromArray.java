package Numbers;

public class MaxNumberFromArray {
	public static void main(String[] args) 
	{
		int a[]={10,5,26,28};
		int max=a[0];
			for(int i=1;i<a.length;i++)
			{
				if(max<a[i])
				{
					max=a[i];
				}
			}
	System.out.println("Max Number in Array="+max);

	}
}
