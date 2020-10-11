import java.util.Random;

public class EmpWage
{
	public static void main(String agrs[])
	{


		System.out.println("Welcome to Employee Wage Compuation");
		Random rand=new Random();
		int i=rand.nextInt(2);
		int isPresent=1;
		int WagePerHour=20, HourPerDay=8, PartTimeHour=4;

		if(i==1)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}
		System.out.println("Calculate Daily Employee Wage");
		int WagePerDay = (WagePerHour * HourPerDay);
		System.out.println("Daily Employee Wage:"+WagePerDay);
		
		System.out.println("Calculate Part time Employee Wage");
                int WagePerDay1 = (WagePerHour * PartTimeHour);
                System.out.println("Part time Employee Wage:"+WagePerDay1);


		
	}
}
