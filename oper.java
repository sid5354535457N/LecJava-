import java.util.*;

public class oper {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String st=(marks<33) ? "fail" : "pass";
        System.out.println(st);

    }
}