package Day9Assignment;

import java.util.Random;

public class UC5 {
	static int check;

	public static void main(String[] args) {
		/*Calculating Wages
		for a Month
		- Assume 20 Working Day per Month*/
		UC5 obj1=new UC5();
		obj1.check();
		int emppresent=1;
		int empabsent=0;
		int empparttime=2;
		int perdayhr=8;
		int parttimehr=6;
		int wageperhr=20;
		int daypermonth=20;
		System.out.println(check);
		
		if (emppresent==check) {
			System.out.println("emp present full time "+"monthly wage "+(perdayhr*wageperhr)*daypermonth);
			
		}if(empparttime==check) {
			System.out.println("emp part time"+"monthly wage "+(parttimehr*wageperhr)*daypermonth);
		}
		if(empabsent==check) {
			System.out.println("emp absent");
		}
		

	}
	public void check() {
		
		Random obj=new Random();
		check=obj.nextInt(3); // 0 1 2
		
	}

}
