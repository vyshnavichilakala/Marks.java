//Condition to check average of 4 subjects marks greater than 60 or not using if-else 
import java.util.Scanner;
 public class Marks{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		if((m1+m2+m3+m4)/4>60)
	{
	System.out.println("Average is above 60");	
	}
	else
	{
	System.out.println("Average is below 60");
	}
	
}
 }
