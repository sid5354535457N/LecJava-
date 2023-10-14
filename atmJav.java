import java.util.*;
class ATM {
    int PIN=1234;
    double Balance;
    ATM() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your pin:");
        int pin=sc.nextInt();
        if(pin==PIN) {
            menu();
        }
        else{
            System.out.println("Incorrect pin:");
        }
    }
    public void menu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the option:");
        System.out.println("1)Check A/C Balance             2)Withdraw Amount");
        System.out.println("3)Deposit Amount                4)Exit");
        int opt=sc.nextInt();
        if(opt==1) {
            checkbal();
        }
        else if(opt==2) {
            withdrawamt();
        }
        else if(opt==3) {
            depo();
        }
        else if(opt==4) {
            System.out.println("Thanks for using our services:)");
            return;
        }
        else {
            System.out.println("enter a valid option");
            menu();
        }
        
    }
    public void checkbal() {
        System.out.println("your current balance is: "+Balance);
        menu();
    }
    public void withdrawamt() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to withdraw:");
        double exp=sc.nextDouble();
        if(exp>Balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            Balance=Balance-exp;
            System.out.println("Withdrawl successful:");
        }
        menu();
    }
    public void depo() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount for Deposit:");
        double dep=sc.nextDouble();
        Balance=Balance+dep;
        System.out.println("Money Successfully deposited:");
        menu();
    }
}
public class atmJav {
    public static void main(String[] args) {
        ATM user=new ATM();
    }
}
