import java.util.Scanner;                      

public class Array_replace{
	public static void main(String[] args) {
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int flag=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Element");
			a[i]=sc.nextInt();
		}

		System.out.println("Enter b");
		int b=sc.nextInt();

		System.out.println("Enter c");
		int c=sc.nextInt();

		for(int i=0;i<n;i++)
		{
			if(b==a[i])
			{
				a[i]=c;
				flag++;
			System.out.println("The element is :"+a[i]);
			}

		}

		if(flag!=0)
		{
			System.out.println("Final array is:");
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
		}
		else
		{
			System.out.println("Not changed value in array.");
		}
		
		
	}
}