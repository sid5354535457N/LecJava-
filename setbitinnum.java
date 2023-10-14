import java.net.SocketTimeoutException;

public class setbitinnum {
    public static int find(int n) {
        int count=0;
        while(n>0) {
            if((n&1)!=0) {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]) {
        System.out.println("no. of 1 is:"+find(10));
    }
    
}
