import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class EmpWage
{

	public void empSal( )
	{
		System.out.println("Welcome to Employee Wage Problem");
        	Random rand=new Random();
        	int i=rand.nextInt(2);
        	int WagePerHour=20;
        	int HourPerDay=8,empHour=0,day=1;
        	String empName=" ";
        	int PartTimeHoursPerDay=4;
        	int salary=0 , FullTime=1 , PartTime=2;
		int totalSal=0;
        	if (i == 1)
        	{
                	System.out.println("Employee Present");
        	}
        	else
        	{
                	System.out.println("Employee Absent");
        	}
        	System.out.println("****************************************");
       		System.out.println("Calculating Daily wage Of Employee");
        	int WagePerDay=(WagePerHour * HourPerDay);
        	System.out.println("Daily Employee wage:"+WagePerDay);

        	System.out.println("****************************************");
        	System.out.println("Calculate wages for month");
        	System.out.println("Employee wage");

        	System.out.println("Enter number of working days");
		while(day<=20 && empHour<=100)
		{
			int empCheck=rand.nextInt(2);
			switch(empCheck){
			case 0 :
				empName="FullTime";
				empHour=empHour+8;
				break;
			case 1 :
				empName="PartTime";
				empHour=empHour+4;
				break;
		}
		salary=(empHour*WagePerHour);
		System.out.println("Salary of " + empName + " on the " +day+ " is " +salary);
		totalSal=(totalSal+salary);
		day++;
	}
	System.out.println("Total Employee Wage="+totalSal);

}
	public static void main(String[] args)
	{
		EmpWage ew=new EmpWage();
		ew.empSal();
	}


}

