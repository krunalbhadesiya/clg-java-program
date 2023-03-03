import java.util.*;

public class p12 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        Random rd = new Random();
        for(int i=0;i<3;i++){
            char c=(char)(rd.nextInt(26)+'A');
            s.append(c);
        }
        for(int i=0;i<4;i++){
            char n=(char)(rd.nextInt(9)+'0');
            s.append(n);
        }
        System.out.println("Your Vehicle Number Plate Is "+s);
    }
}
