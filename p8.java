import java.util.Scanner;

public class p8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Character : ");
    char ch = input.next().charAt(0);
    //method-1
    if(Character.toLowerCase(ch)=='a'||Character.toLowerCase(ch)=='e'||Character.toLowerCase(ch)=='i'||Character.toLowerCase(ch)=='o'||Character.toLowerCase(ch)=='u'){
      System.out.print(ch + " is vowel");
      
    }else{
      System.out.print(ch + " is constant");
    }

    //method-2
    /*switch (Character.toLowerCase(ch)) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
      System.out.print(ch + " is vowel");
      break;
    default:
      System.out.print(ch + " is constant");
    }*/
  }
}