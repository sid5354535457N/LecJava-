import java.util.*;

public class conti {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("enter a no.:");
            int i=sc.nextInt();
            if(i%10==0){
                continue;
            }
            System.out.println(i);
        }while(true);
        }
    }
