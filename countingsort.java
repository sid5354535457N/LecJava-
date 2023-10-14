public class countingsort {
    public static void countsort(int array[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++) {
            largest=Math.max(largest,array[i]);
        }
        int[] count=new int[largest+1];
        for(int i=0;i<array.length;i++) {
            count[array[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++) {
             while(count[i]>0) {
                array[j]=i;
                j++;
                count[i]--;
             }
        }
    }
    public static void printarray(int array[]) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]) {
        int array[]={5,4,3,2,1};
        countsort(array);
        printarray(array);
    }
    
}
