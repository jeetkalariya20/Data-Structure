import java.util.Scanner;                      

public class Prime
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter n:");
		int n=input.nextInt();

		int flag=0;
		for(int i=2;i<n;i++) 		// n<=n/2
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("number is not prime.");
		}
		else
		{
			System.out.println("number is prime.");
		}

	}
}