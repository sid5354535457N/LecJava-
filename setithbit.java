public class setithbit {
    public static void getnum(int n,int i) {
        int bitnum=1<<i;
        System.out.println(n|bitnum);
    }
    public static void main(String args[]) {
        getnum(10,2);
    }
    
}
