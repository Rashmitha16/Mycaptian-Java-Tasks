import java.util.Scanner;
class Task3{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int d,sum=0,rem;
		d=num;
		while(d!=0)
		{
			rem=d%10;
			sum=sum+rem;
			d=d/10;
		}
		System.out.println("Sum of digits is " + sum);
	}
	
}
