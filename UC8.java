package Day9Assignment;

import java.util.Random;

/*Compute Employee Wage
for multiple companies - Note: Each Company has its own*/

public class UC8 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tcs obj=new tcs();
		obj.wageComputation();
		hcl obj1=new hcl();
		obj1.wageComputation();

	}

}

class tcs{
	private static final int wagePerHour = 20; //class variable
	private static final int fullTimeHour = 8;
	private static final int partTimeHour = 4;
	static int workingDaysOfMonth = 0;
	static int totalHour = 0;
	static int totalDailyWage = 0;

	

	public  void wageComputation() {          // method
		
		while (totalHour < 100 && workingDaysOfMonth < 20) {
			Random obj=new Random();
			int check=obj.nextInt(3);

			workingDaysOfMonth++;

			switch (check) {
			case 1:
				totalHour = totalHour + fullTimeHour;
				totalDailyWage = totalDailyWage + fullTimeHour * wagePerHour;
				System.out.println("Employee is present full time: " + totalDailyWage);
				break;
			case 2:
				totalHour = totalHour + partTimeHour;
				totalDailyWage = totalDailyWage + partTimeHour * wagePerHour;
				System.out.println("Employee is present half time: " + totalDailyWage);
				break;
			default:
				System.out.println();
				System.out.println("Employee is absent: " + totalDailyWage);
			}
			System.out.println();
			System.out.println("Working Days is for tcs : " + workingDaysOfMonth + " Hours: " + totalHour);
		}
		System.out.println();
		System.out.println("Employee total wage for month is for tcs : " + totalDailyWage);
	}
	
	
}

class hcl{
	
	private static final int wagePerHour = 20; //class variable
	private static final int fullTimeHour = 8;
	private static final int partTimeHour = 4;
	static int workingDaysOfMonth = 0;
	static int totalHour = 0;
	static int totalDailyWage = 0;

	

	public  void wageComputation() {          // method
		
		while (totalHour < 100 && workingDaysOfMonth < 20) {
			Random obj=new Random();
			int check=obj.nextInt(3);

			workingDaysOfMonth++;

			switch (check) {
			case 1:
				totalHour = totalHour + fullTimeHour;
				totalDailyWage = totalDailyWage + fullTimeHour * wagePerHour;
				System.out.println("Employee is present full time: " + totalDailyWage);
				break;
			case 2:
				totalHour = totalHour + partTimeHour;
				totalDailyWage = totalDailyWage + partTimeHour * wagePerHour;
				System.out.println("Employee is present half time: " + totalDailyWage);
				break;
			default:
				System.out.println();
				System.out.println("Employee is absent: " + totalDailyWage);
			}
			System.out.println();
			System.out.println("Working Days is for hcl : " + workingDaysOfMonth + " Hours: " + totalHour);
		}
		System.out.println();
		System.out.println("Employee total wage for month is for hcl : " + totalDailyWage);
	}
	
	
	
}
