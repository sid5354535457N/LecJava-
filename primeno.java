import java.util.*;

public class primeno {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1) {
            System.out.println(n+" is not a prime no.");
        }
        else if(n==2) {
            System.out.println("2 is a prime no.");

        }
        else {
            for(int i=2;i<=n-1;i++) {
            
                
                if(n%i==0) {
                    System.out.println(n+" is not a prime no.");
                    break;
                
                }
                else {
                    System.out.println(n+" is a prime no.");
                    break;
                }
            }
        }

       
    }
    
}
