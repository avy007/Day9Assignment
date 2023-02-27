package Day9Assignment;

import java.util.Random;

public class UC1 {
	
	public static void main(String[] args) {
		/*Check Employee is
		Present or Absent
		- Use ((RANDOM)) for Attendance
		Check*/
		
		
		int emppresent=1;
		int empabsent=0;
		int check;
		
		Random obj=new Random();
		check=obj.nextInt(2);
		System.out.println(check);
		
		if(emppresent==check) {
			
			System.out.println("emp present");
		}else {
			System.out.println("emp absent");
		}
		

	}

}
