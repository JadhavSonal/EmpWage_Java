import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class EmpWage
{

                public static final int WagePerHour=20;
                public static final int HourPerDay=8;
                public static final int PartTimeHoursPerDay=4;
                public static final int FullTime=1 , PartTime=2;


        public static void empWage(String Company_Name,int Day,int empHour)
        {
                System.out.println("Welcome to Employee Wage Problem");
                Random rand=new Random();
                String empName=" ";
                //int empHour=0;
		int day=1,TotalSal=0,Salary;
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
                System.out.println("Calculating Daily wage Of Employee");
                int WagePerDay=(WagePerHour * HourPerDay);
                System.out.println("Daily Employee wage:"+ WagePerDay);

                System.out.println("****************************************");
                System.out.println("Calculate wages for month");
                System.out.println("Employee wage");

                System.out.println("Enter number of working days");
                while(day<=20 && empHour<=100)
                {
                        int empCheck=rand.nextInt(2);
                        switch(empCheck){
                        case 0 :
                                empName="Fulltime";
                                empHour=empHour+8;
                                break;
                        case 1 :
                                empName="Parttime";
                                empHour=empHour+4;
                                break;
                }
                Salary=(empHour*WagePerHour);
                System.out.println("Salary of " + empName + " on the " +day+ " is " +Salary);
                TotalSal=(TotalSal+Salary);
                day++;
        }
        System.out.println("Total Employee Wage="+TotalSal);

}
        public static void main(String[] args)
        {

                EmpWage ew=new EmpWage();
                ew.empWage("TCS",10,15);
		EmpWage ew1=new EmpWage();
                ew1.empWage("IBM",15,25);

        }


}

