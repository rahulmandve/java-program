package Numbers;

public class Amstrong {
public final synchronized strictfp static void main(String[] args) {
	
	int n=153;
	int r,sum=0,temp=n;
	while(n>0)
	{
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}
	if(sum==temp)
	{
		System.out.println("Number is Amstrong");
			
	}else{
		
		System.out.println("Not Amnstrong Number");
	}
	
}
}
