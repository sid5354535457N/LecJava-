public class exercisebit {
    public static void swap(int a,int b) {
        int bitone=a|b;
        int bittwo=a&b;
        System.out.println("a="+bitone+"\nb="+bittwo);
    }
    public static void main(String args[]) {
        swap(10,7);

    }
    
}
