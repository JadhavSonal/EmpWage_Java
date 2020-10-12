import java.util.Random;
class empSal{
	int Wage_per_hour=20,Day_Hour=0,Total_Wage=1;
	int count=1,hours=0,Total_Month_Wage=0;
	Random rand = new Random();
	void check(){
		while(count<21&&hours<100){
			int ch = rand.nextInt(10) % 3;
			switch (ch){
				case 0:
					System.out.println("Present Full time employee");
					Day_Hour=8;
					break;
				case 1:
					System.out.println("Present Part time employee");
					Day_Hour=4;
					break;
				default:
					System.out.println("Invalid choice");
					Day_Hour=0;
					break;
			}
			hours=hours+Day_Hour;
			Total_Wage=Wage_per_hour*Day_Hour;
			Total_Month_Wage=Total_Month_Wage+Total_Wage;
			System.out.println("Total Wage of "+count+" Day : "+Total_Wage);
			count=count+1;
		}
	
		System.out.println("Total Month Wage : "+Total_Month_Wage);
		System.out.println("Total Month Work Hours : "+hours);
		
	}
}
public class EmpWage{
	public static void main(String args[]){
		System.out.println("Welcome to Employee Wage Computation Program");
		empSal e1=new empSal();
		e1.check();
	}
}
