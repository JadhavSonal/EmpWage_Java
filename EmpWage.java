import java.util.Random;
import java.util.*;
public class EmpWage
{
	public static void main(String agrs[])
	{


		System.out.println("Welcome to Employee Wage Compuation");
		Random rand=new Random();
		int i=rand.nextInt(2);
		int WagePerHour=20, HourPerDay=8, PartTimeHour=4,empHour=0;
		String empName=" ";
		int salary=0, totalSal=0,FullTime=1,PartTime=2;
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

		System.out.println("Enter number of working days");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int day=1;day<=num;day++)
		{
		int empCheck=rand.nextInt(2);
		switch(empCheck){
		case 0 :
			empName="FullTime";
			empHour=8;
			break;
		case 1 :
			empName="PartTime";
			empHour=4;
			break;
		}
		salary=(empHour*WagePerHour);
		System.out.println("Salary of " + empName + " on the " +day+ " is " +salary);
		totalSal=(totalSal+salary);
	}
	System.out.println("Total Salary="+totalSal);
	}
}
