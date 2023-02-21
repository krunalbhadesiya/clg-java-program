import java.util.Scanner;

//Write a program to convert rupees to dollar. 70 rupees=1 dollar.

public class p2 {
    public static void main(String args[])
    {
        float rupees;
        Scanner in = new Scanner(System.in);
        System.out.println("please entetr rupeess:");
        rupees = in.nextLong();
        float dollars = rupees/70;
        System.out.println(dollars+"Dollars");       
    } 
}
