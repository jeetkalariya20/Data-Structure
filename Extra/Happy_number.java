import java.util.Scanner;

public class Happy_number{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n= sc.nextInt();
		int sum=0;

		while(n>9)
		{
			sum=0;
			while(n>0)
			{
				int r=n%10;
				sum=sum+r*r;
				n=n/10;
			}
			n=sum;
			
		}


		if(n==1)
		{
			System.out.println("Happy Number");
		}
		else
		{
			System.out.println("Not Happy Number");
		}



	}
}