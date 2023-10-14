import java.util.*;
public class randomm {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Random num=new Random();
        int x=num.nextInt(a);
        double y=num.nextDouble();
        boolean z=num.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    
}
