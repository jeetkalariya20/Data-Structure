import java.util.Scanner;

public class Prime_without_modulo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int flag=0;
		int a=n;

		for(int i=2;i<n;i++)
		{
			while(a>=0)
			{
				if(a!=0)
				{
					a=a-i;
				}
				else
				{
					flag=1;
					break;
				}
			}

		}
		if(flag==1)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("prime");
		}
	}
}