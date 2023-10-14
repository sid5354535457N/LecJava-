public class palindromestring {
    public static boolean print(String str) {
        int n=str.length();
        for(int i=0;i<n/2;i++) {
            if(str.charAt(i)!=str.charAt(n-i-1)) {
                return false;
            }
           
        }
        return true;
    }
    public static void main(String args[]) {
        String str="eye";
        System.out.println(print(str));
    }
    
}
