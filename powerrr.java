public class powerrr {
    public static int pow(int x,int n) {
        if(n==0) {
            return 1;
        }
        int xn1=pow(x,n-1);
        int xn=x*xn1;
        return xn;
        //return x*pow(x,n-1)
    }
    public static void main(String args[]) {
        System.out.println(pow(2,10));
    }
    
}
