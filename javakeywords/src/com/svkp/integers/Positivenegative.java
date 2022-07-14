package com.svkp.integers;




import java.util.Scanner;
public class Positivenegative {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		 System .out.println("Enter the number:");
		 num=sc.nextInt();
  if(num>0) { 
   System.out.println(" Given number is Positive");
  }
  else if(num<0) {
System.out.println(" Given number is Negative");
  }
else {
System.out.println(" Given number is Zero");
}
	
}
}