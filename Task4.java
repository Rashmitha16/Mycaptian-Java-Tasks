import java.util.Scanner;
class Task4
  {
     public static void main (String args[])   
       {
          Scanner sc = new Scanner (System.in);
          System.out.println("entre value in inch");
          double a= sc.nextDouble();
          double b=(0.0254)*a;
          System.out.println("Value in meter is"+b);
          
      }
  }
