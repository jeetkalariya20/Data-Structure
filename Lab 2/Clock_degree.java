import java.util.Scanner;          //degree between houdhand and minitehand

public class Clock_degree{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Hourhand:");
		int hour=sc.nextInt();

		System.out.println("Enter Minutehand:");
		int minute=sc.nextInt();

		if(hour>12 || minute>60 || hour<1 || minute<1)
			{
				System.out.println("Envalid Input...");
			}

		int hour_angle= (int) (0.5 * (hour*60));
		int minute_angle=(int) (6*minute);

		int angle=Math.abs(hour_angle-minute_angle);
		angle=Math.min(360-angle,angle);
		System.out.println(angle+" Degree");

	}
}