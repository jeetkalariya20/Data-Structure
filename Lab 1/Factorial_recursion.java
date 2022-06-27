import java.util.Scanner;         

public class Factorial_recursion{
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("enter n:");
		int n=input.nextInt();

		Lab1_2 obj=new Lab1_2();
		int result=obj.fact(n);
		System.out.println(result);
	}

	int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
}