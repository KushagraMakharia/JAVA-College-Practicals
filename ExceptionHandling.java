import java.util.Scanner;
class ExceptionHandling{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number:");
	int a = sc.nextInt();
	System.out.println("Enter second number:");
	int b = sc.nextInt();
	try{
		int i = a/b;	
		

	}
	catch(ArithmeticException ex){
		System.out.println("Error! Number can't be divided by 0");
		
	
	}
			

}}