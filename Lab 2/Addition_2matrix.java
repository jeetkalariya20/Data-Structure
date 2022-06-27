import java.util.Scanner;                 

public class Addition_2matrix{
	public static void main(String[] args) {
		
		int a[][]=new int [2][2];
		int b[][]=new int [2][2];
		int c[][]=new int [2][2];

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter First Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
					a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter Second Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
					b[i][j]=sc.nextInt();
			}
		}

		System.out.println("First Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
					System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}


		System.out.println("Second Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
					System.out.print(b[i][j]+"\t");
			}
			System.out.println("\n");
		}

		System.out.println("Sum Of Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+"\t");
			}
			System.out.println("\n");
		}


	}
}