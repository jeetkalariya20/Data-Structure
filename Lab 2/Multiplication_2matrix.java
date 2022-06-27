import java.util.Scanner;          

public class Multiplication_2matrix{
	public static void main(String[] args) {
		
		int a[][]=new int [3][2];
		int b[][]=new int [2][3];
		int c[][]=new int [3][3];
		int sum;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter First Matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
					a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter Second Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
					b[i][j]=sc.nextInt();
			}
		}



		System.out.println("First Matrix");
		for(int i=0;i<3;i++)
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
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("\n");
		}


		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			sum=0;
				for(int k=0;k<2;k++)
				{
					sum=sum+a[i][k]*b[k][j];
				}
				c[i][j]=sum;
			}
		}

		System.out.println("Multiplication of Matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++){
				System.out.print(c[i][j]+"\t");
		}
		System.out.println("\n");
	}
	}
}