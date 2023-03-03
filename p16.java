import java.util.*;

public class p16 {
    static int factorial(Integer n){
        if(n == 1)
            return 1;
        else
            return(n*factorial(n-1));
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number To Find Factorial:");
        int inpNum= input.nextInt();
        int result= factorial(inpNum);
        System.out.println("Factorial Of "+inpNum+"  Is  "+result);
    }
    
}
