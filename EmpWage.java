import java.util.Random;
import java.util.Scanner;
public class EmpWage
		
{		public static  String company;
	        public static  int EmpWagePerHour;
                public static  int NumOfWorkingDays;
                public static  int MaxHoursPerMonth;
                public static  int FullTime=1 , PartTime=2;
		public static int TotalWage;


	public  EmpWage(String company,int EmpWagePerHour, int NumOfWorkingDays,int  MaxHoursPerMonth){
	this.company=company;
	this. EmpWagePerHour=EmpWagePerHour;
	this. NumOfWorkingDays=NumOfWorkingDays;
	this. MaxHoursPerMonth=MaxHoursPerMonth;

	}

	public static void CalculateEmpWage( )
	{
		System.out.println("Welcome to Employee Wage Problem");
        	Random rand=new Random();
		String empName=" ";
		int EmpHour=0,Days=0,TotalEmpHrs=0;
		int TotalSal=0;

        	int i=rand.nextInt(2);
        	if (i == 1)
        	{
                	System.out.println("Employee Present");
        	}
        	else
        	{
                	System.out.println("Employee Absent");
        	}
        	System.out.println("****************************************");
       		//System.out.println("Calculating Daily wage Of Employee");
        	//int wageperDay=(wageperHour * hourperDay);
        	//System.out.println("Daily Employee wage:"+wageperDay);

        	System.out.println("****************************************");
        	//System.out.println("Calculate wages for month");
        	System.out.println("Employee wage for month");
		//int num=1;
        	//System.out.println("Enter number of working days");
		while(TotalEmpHrs<=MaxHoursPerMonth && Days<= NumOfWorkingDays)
		{
			Days++;
			int empCheck=rand.nextInt(2);
			switch(empCheck){
			case 0 :
				empName="FullTime";
				EmpHour=EmpHour+8;
				break;
			case 1 :	
				empName="PartTime";
				EmpHour=EmpHour+4;
				break;
		}
		TotalEmpHrs=TotalEmpHrs+EmpHour;
		System.out.println("Days :"+ Days + " Employee Hour :" +EmpHour);
		}
		TotalWage=TotalEmpHrs * EmpWagePerHour;
	}
	@Override
	public String toString( ){
	return "Total Employee Wage for Company :"+company+" is :"+TotalWage;
	}

	public static void main(String[] args)
	{
		EmpWage IBM=new EmpWage("IBM",20,5,10);
		IBM.CalculateEmpWage();
		System.out.println(IBM);
		EmpWage TCS=new EmpWage("TCS",10,5,25);
		TCS.CalculateEmpWage();
		System.out.println(TCS);
	}


}

