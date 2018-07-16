package StringProgram;

public class ReverseString {
	public String reverse(int arr[],int k)
	{
		String s="";
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]==k)
		{
			s="Yes";
		}
		else{
			s="No";
		}
		}
		return s;
	}

	public static void main(String[] args) {
		ReverseString r=new ReverseString();
		r.reverse(new int []{1,2,5,7},5);
		
	}
	
}
