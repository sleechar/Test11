package Test11;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		int x ;
		System.out.println("Input number of 1 to 20 for 5 times");
		System.out.print("please input value1 : ");
		Scanner input1 = new Scanner(System.in);
		int value1 = input1.nextInt();
		
		System.out.print("please input value2 : ");
		Scanner input2 = new Scanner(System.in);
		int value2 = input2.nextInt();
		
		System.out.print("please input value3 : ");
		Scanner input3 = new Scanner(System.in);
		int value3 = input3.nextInt();
		
		System.out.print("please input value4 : ");
		Scanner input4 = new Scanner(System.in);
		int value4 = input4.nextInt();
		
		System.out.print("please input value5 : ");
		Scanner input5 = new Scanner(System.in);
		int value5 = input5.nextInt();
		
		if(value1 >= 0 && value1 <= 20) {
			
			for( x=1; x<=value1;x++ ) 
				System.out.print("*");		
			
			System.out.println("");	
		}
		
		if(value2 >= 0 && value2 <= 20) {
			
			for( x=1; x<=value2;x++ ) 
				System.out.print("*");	
			
			System.out.println("");
		}
		
		if(value3 >= 0 && value3 <= 20) {
			
			for( x=1; x<=value3;x++ ) 
				System.out.print("*");
			
			System.out.println("");
		}
		
		if(value4 >= 0 && value4 <= 20) {
			
			for( x=1; x<=value4;x++ ) 
				System.out.print("*");	
			
			System.out.println("");
		}
		
		if(value5 >= 0 && value5 <= 20) {
			
			for( x=1; x<=value5;x++ ) 
				System.out.print("*");	
			
			System.out.println("");
		}
		

	}

}
