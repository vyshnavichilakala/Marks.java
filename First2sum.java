//To check the sum of First 2 numbers equals to last digit of 3rd num or not using ternary opertor
import java.util.Scanner;
 public class First2sum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a+b;
		int lastDigit = c%10;
  String result = (sum == lastDigit)? ("Sum equals to last digit"):("Sum not equals to last digit");
  System.out.println(result);	}
 }