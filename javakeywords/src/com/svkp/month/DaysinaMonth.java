package com.svkp.month;
import java.util.Scanner;
public class DaysinaMonth {

	public static void main(String[] args) {
		int month;
	Scanner	sc=new Scanner(System.in);
System.out.println("Please enter month number from 1 to 12(1=Jan,and 12=Dec):");
month=sc.nextInt();
switch(month)
{
case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("\n 31 days in this month");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("\n 30 days in this month");
		break;
	case 2:
		System.out.println("\n 28 or 29 days in this month");
		default:
			System.out.println("\n Please enter valid number between 1 to 12");
}
	}

}
