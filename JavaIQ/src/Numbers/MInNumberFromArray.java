package Numbers;

public class MInNumberFromArray {
	public static void main(String[] args) 
	{
		int a[]=new int[]{10,5,26,2};
		int min=a[0];
			for(int i=1;i<=a.length-1;i++)
			{
				if(min>a[i])
				{
					min=a[i];
				}
			}
	System.out.println("Minimum Number in Array is="+min);

	}
}
