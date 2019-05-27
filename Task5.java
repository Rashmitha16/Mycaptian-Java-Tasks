import java.util.Scanner;
class Task5
 {
   public static void main(String args[])
     {
        System.out.println("Entre minutes");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = a/(60*24*365);
        long c = a/(60*24)%365;
        System.out.println(a+"is approximately "+b+"years and "+c);
       

     }
 }