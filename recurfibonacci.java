public class recurfibonacci {
    public static int series(int n) {
        if(n==0 || n==1) {
            return n;
        
        }
        int fn2=series(n-2);
        int fn1=series(n-1);
        int fn=fn1+fn2;
        return fn;
    }
    public static void main(String args[]) {
        System.out.println(series(40));
        
    }
    
}
