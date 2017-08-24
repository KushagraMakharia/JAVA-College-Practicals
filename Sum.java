import java.util.Scanner;
class Sum {
	public static void main(String[] args){
		int j = 0;
		Scanner scan = new Scanner(System.in);
		int a[]=new int[10];
		for(int i = 0;i< 20 ; i++){
			if(i%2 != 0){
				a[j] = i;
				j++;
			}
		}
		int sum = 0;
		for(int i=0; i<10;i++) {
			sum = sum + a[i];
		}
		System.out.println(sum) ;			

	}


}