public class maxsubarraysum {
    public static void maxsubarray(int num[]) {
        int cs=0;
        int maxvalue=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++) {
            for(int j=i;j<num.length;j++) {
                cs=0;
                for(int k=i;k<=j;k++) {
                    
                    System.out.print(num[k]+" ");
                   
                    cs+=num[k];
                }
                System.out.println();
                System.out.print("sum= "+cs);
                System.out.println();
                if(maxvalue<cs) {
                    maxvalue=cs;
                }
            }
        }
        System.out.print("max subarray sum= "+maxvalue);
    }
    public static void main(String args[]) {
        int num[]={2,4,6,8,10};
        maxsubarray(num);
    }
    
}
