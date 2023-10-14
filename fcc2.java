import java.util.*;

public class fcc2 {
    public static int fact(int a) {
        int f=1;
        for(int i=1;i<=a;i++) {
            f=f*i;
            
        }
        return f;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       
        int hii=fact(a);
        System.out.println(hii);
    }
    
}
