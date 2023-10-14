public class recursum { 
    public static int sum(int n) {
        if(n==0) {
            return 0;
        }
        int fn1=sum(n-1);
        int fn=n+fn1;
        return fn;
    }
    public static void main(String args[]) {
        System.out.println(sum(3));
    }
    
}
