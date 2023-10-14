public class pairprob {
    public static int pair(int n) {
        if(n==1 || n==2) {
            return n;
        }
        int fn1=pair(n-1);
        int fn2=pair(n-2);
        int way=(n-1)*fn2;
        int totalway=fn1+way;
        return totalway;

    }
    public static void main(String args[]) {
        System.out.println(pair(3));
    }
}