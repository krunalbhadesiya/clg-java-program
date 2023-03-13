import java.util.Scanner;

public class p13  {
    public static void main(String[] args) {
        student s = new student();
        //marks m = new marks();
        result r = new result();
        s.setdata();
        r.setmarks();
        r.setresult();
        s.getdata();
        r.getmarks();
        r.getresult();
    }
}

class student{
    Scanner in = new Scanner(System.in);
    String sname;
    int srno;

    public void setdata(){
        System.out.println("Enter Student Name:");
        sname= in.nextLine();
        System.out.println("Enter Student Roll Number:");
        srno = in.nextInt();
    }
    void getdata(){
        System.out.println("Student Name:"+ sname);
        System.out.println("Student Roll Number:"+srno);
    }
}

/*class marks extends student{
    Scanner in = new Scanner(System.in);
    int sub1,sub2,sub3;
    void setmarks(){
        System.out.println("Enter Subject 1 Marks:");
        sub1 = in.nextInt();
        System.out.println("Enter Subject 2 Marks:");
        sub2 = in.nextInt();
        System.out.println("Enter Subject 3 Marks:");
        sub3 = in.nextInt();
    }
    void getmarks(){
        System.out.println("student Subject 1 Marks:"+sub1);
        System.out.println("student Subject 2 Marks:"+sub2);
        System.out.println("student Subject 3 Marks:"+sub3);
    }
}*/

class result extends student{
    Scanner in = new Scanner(System.in);
    int sub1,sub2,sub3;
    double total,percentage;
    void setmarks(){
        System.out.println("Enter Subject 1 Marks:");
        sub1 = in.nextInt();
        System.out.println("Enter Subject 2 Marks:");
        sub2 = in.nextInt();
        System.out.println("Enter Subject 3 Marks:");
        sub3 = in.nextInt();
    }
    void getmarks(){
        System.out.println("student Subject 1 Marks:"+sub1);
        System.out.println("student Subject 2 Marks:"+sub2);
        System.out.println("student Subject 3 Marks:"+sub3);
    }
    void setresult(){
        total= sub1+sub2+sub3;
        percentage= (total/3);
    }
    void getresult(){
        System.out.println(":::: Student Result ::::");
        System.out.println("Total Marks:"+total);
        System.out.println("Percentege:"+percentage);
    }
}