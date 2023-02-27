package Day9Assignment;

import java.util.Random;

public class UC3 {static int check;

public static void main(String[] args) {
	//Add Part time
	 //Employee & Wage
	//- Assume Part time Hour is 8
	
	int emppresent=1;
	int empparttime=0;
	int wageperhr=20;
	int perdayhr=8;
	int parttimehr=6;
	
	//int check;
	UC3 obj1=new UC3();
	obj1.empcheck();
	
	System.out.println(check);
	
	
	if (emppresent==check) {
		System.out.println("emp present full time ");
		System.out.println(" daily wage "+perdayhr*wageperhr);
	}if(empparttime==check) {
		System.out.println("emp present part time ");
		System.out.println("emp daily wage "+wageperhr*parttimehr);
		
	}
	

}
public void empcheck() {
	
	Random obj=new Random();
	 check=obj.nextInt(2);
}


}
