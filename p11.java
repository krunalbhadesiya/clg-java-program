import java.util.*;

class p11{
  public static void main(String[] args) {
    System.out.println("Enter String to Check Palindrome String or not");
    Scanner input = new Scanner(System.in);
    String inpstr = input.nextLine();
    String str = inpstr , reverseStr = "";
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
  }
}