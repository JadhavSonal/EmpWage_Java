import java.util.Random;

public class EmpWage
{
	public static void main(String agrs[])
	{	
		System.out.println("Welcome to Employee Wage Compuation");

		Random rand=new Random();
		int i=rand.nextInt(2);
		int isPresent=1;
		if(i==1)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}
	}
}
