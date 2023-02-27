package Day9Assignment;

import java.util.Random;

public class UC2 {
	public static void main(String[] args) {
		/*Calculate Daily
		Employee Wage  WAGE PER HR=20; PER DAY =8HR*/
		
		int emppresent=1;
		int empabsent=0;
		int wageperhr=20;
		int perdayhr=8;
		int check;
		
		Random obj=new Random();
		check=obj.nextInt(2);
		
		if (emppresent==check) {
			System.out.println("emp present");
			System.out.println("emp daily wage "+perdayhr*wageperhr );
		}else {
			System.out.println("emp absent " + "daily wage=0 ");
		}
		

	}


}
