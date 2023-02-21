import java.util.Scanner;

public class p3 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter marks of 6 subjects:");
       float s1 =sc.nextInt();
       float s2 =sc.nextInt();
       float s3 =sc.nextInt();
       float s4 =sc.nextInt();
       float s5 =sc.nextInt();
       float s6 =sc.nextInt();

       float percentage =((s1+s2+s3+s4+s5+s6)/60);

       System.out.println("Your Percentage is"+percentage+"%");
       

    }
    
}
