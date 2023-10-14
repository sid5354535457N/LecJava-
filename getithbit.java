public class getithbit {
    public static int get(int n,int i) {
        int bitnum=1<<i;
        if((n & bitnum)==0) {
            return 0;
        }
        else {
            return 1;
        }

    }
    public static void main(String args[]) {
        int n=10;
        int i=2;
        System.out.println(get(n,i));
    }
    
}
