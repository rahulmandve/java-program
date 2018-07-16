package Numbers;

public class SecondHighestNoInArray {
	
	public static int[]secondHighest(int arr[])
	{
	int temp;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("Second Highest Number in Array="+arr[arr.length-2]);

		return arr;
	}
	
	public static void main(String[] args) 
	{
		SecondHighestNoInArray.secondHighest(new int[]{12,2,30,40});
	}

}
