import java.util.Scanner; 
class Desc {
	public static void main(String[] args){
		System.out.println("Enter any number:");
		Scanner scan = new Scanner(System.in);
		int a[] = new int[10];
		for(int i = 0; i < 10 ; i++) {
			a[i] = scan.nextInt();	
		}
		for(int i = 0; i<9;i++){
			for(int j=i+1; j<10;j++) {
				if(a[i] < a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}	
		}
		for(int i = 0; i<10;i++){
			System.out.println(a[i]);
		}
	}


}