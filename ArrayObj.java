import java.util.Scanner;
class Student
{
	Scanner sc = new Scanner(System.in);
	String name;
	int no,age;
	public void input()
	{
		System.out.println("Enter name of student");
		name = sc.nextLine();
		System.out.println("Enter enrollment no");
		no = sc.nextInt();
		System.out.println("Enter age Of Student");
		age = sc.nextInt();
	}
	public void display()
	{
		System.out.println("NAME = "+name);
		System.out.println("ENROLLMENT NO. = "+no);
		System.out.println("AGE = "+age);
	}
}
class ArrayObj
{
	public static void main(String args[])
	{
		Student[] s = new Student[5];
		for(int i = 0;i<5;i++)
		{
			s[i] = new Student();
			s[i].input();
			
		}
		
		for(int i=0;i<5;i++)
		{
		s[i].display();
		}
	}	
}