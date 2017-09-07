import java.util.Scanner;
class ExceptionHandlingA{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int array[] = {20,20,40};
	try{
		for(int i=0; i<= 5 ; i++){
			System.out.println(array[i]);
		}	
		

	}
	catch(ArrayIndexOutOfBoundsException ex){
		System.out.println("Array Index is out of range. Please try again.");
		
	
	}
			

}}