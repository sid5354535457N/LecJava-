import java.util.*;

public class Javabill {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to our hotel:) \n Here is your order list");
        System.out.println("1)Onion Pizza Rs.199 \n2)Paneer Pizza Rs.299 \n3)Cheese Bhrust Pizza Rs.379 \n4)French Fries Rs.149 \n5)Choco lava Cake Rs.189");
        int o=199;
        int p=299;
        int c=379;
        int f=149;
        int cc=189;
        System.out.println("Enter the no. of onion pizza");
        int O=sc.nextInt();
        System.out.println("Enter the no. of paneer pizza");
        int P=sc.nextInt();
        System.out.println("Enter the no. of Cheese bhrust pizza");
        int C=sc.nextInt();
        System.out.println("Enter the no. of Fries");
        int F=sc.nextInt();
        System.out.println("Enter the no. of onion pizza");
        int CC=sc.nextInt();
        int total=O*199 + P*299 + C*379 + F*149 + CC*189 + 20;
        System.out.println("Do you want to split the bill:");
        String split=sc.next();
        if(split=="yes") {
            System.out.println("number people paying for bill");
            int num=sc.nextInt();
            System.out.println("Your total bill is"+total);
            System.out.println("Each person will pay"+total/num);

        }
        else {
            System.out.println("okay");
            System.out.println("Your total bill is"+total);

            
        }
        
    
    }    
}
