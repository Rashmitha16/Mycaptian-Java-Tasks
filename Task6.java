import java.util.Scanner;
public class Task6
{
    public static void main(String[] args) 
    {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        num = s.nextInt();
        if(num > 0)
        {
            System.out.println("The given number "+num+" is Positive");
        }
        else if(num < 0)
        {
            System.out.println("The given number "+num+" is Negative");
        }
        else
        {
            System.out.println("The given number "+num+" is neither Positive nor Negative ");
        }
    }
}