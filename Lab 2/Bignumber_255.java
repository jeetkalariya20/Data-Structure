import java.util.Scanner;
import java.math.BigInteger;

public class Bignumber_255{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		String s1=sc.nextLine();
		System.out.println("Enter Second Number:");
		String s2=sc.nextLine();
		BigInteger sum;


		BigInteger b1=new BigInteger(s1);
		BigInteger b2=new BigInteger(s2);

		sum=b1.add(b2);
		System.out.println("Answer is:"+sum);
	}
}