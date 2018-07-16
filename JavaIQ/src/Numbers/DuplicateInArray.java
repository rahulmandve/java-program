package Numbers;

public class DuplicateInArray {
	
	public static String[] duplicateString(String arr[])
	{
				
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]) && (i!=j))
				{
					System.out.println("Duplicate Elements in String====="+arr[j]);
				}
					
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		DuplicateInArray.duplicateString(new String[]{"ram","rahul","raj","rahul"});
	}

}
