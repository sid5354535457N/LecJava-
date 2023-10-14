public class largestarray {
    public static int getlargest(int num[]) {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++) {
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]) {
                smallest=num[i];
            }
           
        }
        System.out.println("Smallest: "+smallest);
        return largest;
    }
    public static void main(String args[]) {
        int num[]={1,23,45,22,12,13};
        System.out.println("Largest is: "+getlargest(num));
    }
    
}
