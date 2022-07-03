import java.util.Scanner;

public class Second_max_loop
{
	public static void main(String[] args) 
	{
		int a[]={1,3,8,5,35,39,26};
		int smax=a[0];
		int max=a[0];

		for(int i=0;i<a.length;i++)
		{
			if(max<=a[i])
			{
				smax=max;
				max=a[i];
			}
			else if(smax<a[i])
			{
				smax=a[i];
			}

		}
		System.out.println(smax);
	}
}


