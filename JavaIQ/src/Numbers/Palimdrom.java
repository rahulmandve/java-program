package Numbers;

public class Palimdrom {
	public static void main(String[] args) {
		int n=123;
		int r,sum=0,temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
	
		if(sum==temp)
		{
			System.out.println("Number is Palimdrom");
		}else{
			
			System.out.println("Not Palimdrom Number");
		}
	}
}
