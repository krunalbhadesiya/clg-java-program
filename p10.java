import java.util.Scanner;


public class p10 {
    public static void main(String[] args) {
        String s;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String :");
        s = in.nextLine();
        System.out.println("Length of ths String is :"+s.length());
        System.out.print("second half of the sring is:");
        System.out.println(s.substring(s.length() / 2));
   }
}
