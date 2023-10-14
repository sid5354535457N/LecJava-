public class substringg {
    public static String sub(String str,int si,int ei) {
        String subs="";
        for(int i=si;i<ei;i++) {
            subs+=str.charAt(i);
        }
        return subs;
    }
    public static void main(String args[]) {
        String str="Hello World";
        System.out.println(sub(str,0,4));
        System.out.println(str.substring(0,4));
    }
    
}
