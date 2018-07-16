package Numbers;

public class DescendingOrder {
	public static void main(String[] args) {
		int temp=0;
		
		int a[]=new int[]{5,30,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]);
		}
	
	}

}
