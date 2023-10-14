public class prefixsum {
    public static void maxsubarray(int num[]) {
        int cs=0;
        int maxvalue=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<num.length;i++) {
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++) {
            for(int j=i;j<num.length;j++) {
                cs=i==0?prefix[j]:prefix[j]-prefix[i-1];
                
                if(maxvalue<cs) {
                    maxvalue=cs;
                }
            }
        }
        System.out.print("max subarray sum= "+maxvalue);
    }
    public static void main(String args[]) {
        int num[]={1,-2,6,-1,3};
        maxsubarray(num);
    }
    
}
