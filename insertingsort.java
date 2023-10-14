public class insertingsort {
    public static void insert(int array[]) {
        for(int i=1;i<array.length;i++) {
            int temp=array[i];
            int j=i-1;
            while(j>=0 && array[j]>temp) {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }
    }
    public static void printarr(int array[]) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]) {
        int array[]={5,4,3,2,1};
        insert(array);
        printarr(array);

    }
    
}
