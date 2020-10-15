import java.util.*;
import java.util.Random;
import java.util.Scanner;

class EmpWageBuilder{
    public String Company;
    public int NumOfWorkingDays;
    public double WagePerHour;
    public int WorkHourPerMonth;

    EmpWageBuilder(String Company,int NumOfWorkingDays,double WagePerHour,int WorkHourPerMonth) {
        this.Company = Company;
        this.NumOfWorkingDays = NumOfWorkingDays;
        this.WagePerHour= WagePerHour;
        this.WorkHourPerMonth= WorkHourPerMonth;
    }

    public double CalculateEmpWage(EmpWageBuilder[] array,int index) {
        double Wage;
        int HourPerDay = 0;
        String str = "";
        double TotalSalary=0;
        int TotalHour=0;
        int FullTimeHour=0;
        int PartTimeHour=0;
        Random rand = new Random();
        Map<String,Integer> map = new HashMap<>();
        System.out.println("Calculating Wages for a month of "+array[index].Company+" ");
        for(int i=1;i<=array[index].NumOfWorkingDays;i++) {
            if(TotalHour <= array[index].WorkHourPerMonth) {
                int empCheck=rand.nextInt(2);
                switch (empCheck) {
                    case 1:
                        str = "Full Time";
                        HourPerDay = 8;
                        TotalHour += HourPerDay;
                        FullTimeHour+=HourPerDay;
                        map.put(str,FullTimeHour);
                        break;
                    case 2:
                        str = "Part Time";
                        HourPerDay = 4;
                        TotalHour += HourPerDay;
                        PartTimeHour+=HourPerDay;
                        map.put(str,PartTimeHour);
                        break;
                }
                Wage = (HourPerDay) * array[index].WagePerHour;
                TotalSalary += Wage;
            } else {
                break;
            }
        }
        System.out.println("EmployeeType and WorkingHours");
        for ( Map.Entry<String, Integer>  t  :  map.entrySet() )  {
            System.out.println(t.getKey() +" -> "+t.getValue());
        }

        System.out.println();
        System.out.println(Company+" Total Working hours = "+TotalHour);
        return TotalSalary;
    }
}

public class EmpWage extends EmpWageBuilder{
    EmpWage(String Company, int NumOfWorkingDay, double WagePerHour, int WorkHourPerMonth) {
        super( Company, NumOfWorkingDay, WagePerHour,WorkHourPerMonth  );
    }

    public static void checkAttendance() {
        System.out.println("Checking Whether Employee Present Or Absent");
	Random rand = new Random();
        int i=rand.nextInt(2);
        	if (i == 1)
        	{
                	System.out.println("Employee Present");
        	}
        	else
        	{
                	System.out.println("Employee Absent");
        	}
    }

    @Override
    public String toString() {
             return "Company name "+Company+"\nnumber of working days "+NumOfWorkingDays+"\nWage per Hour "+WagePerHour+"\nWorking Hours Per Month "+WorkHourPerMonth;
   }

    public static void main(String[] args){
        System.out.println("Welcome to Employee Computation program\n");

        EmpWage[] array = new EmpWage[2];

        EmpWage TCS = new EmpWage("TCS",25,250,170);
        EmpWage IBM = new EmpWage("IBm",30,160,134);

        array[0] = TCS;
        array[1] = IBM;

        checkAttendance();

        System.out.println("Multiple Company Details");
        for(EmpWage details:array){
            System.out.println(" ");
            System.out.println(details);
        }
        System.out.println("*----------------------------------------------*");

        //Employee wage calculation
        System.out.println("Total Salary = "+TCS.CalculateEmpWage(array,0)+"\n");
        System.out.println("Total Salary = "+IBM.CalculateEmpWage(array,1)+"\n");
    }
}
