public class selectionsort {
    public static void selection(int array[]) {
        for(int i=0;i<array.length;i++) {
            int minipos=i;
            for(int j=i+1;j<array.length;j++) {
                if(array[minipos]>array[j]) {
                    minipos=j;
                } 
            }
            int temp=array[minipos];
            array[minipos]=array[i];
            array[i]=temp;
        }
    }
    public static void printarr(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]) {
        int array[]={4,7,22,54,3,2,1};
        selection(array);
        printarr(array);
    }
    
}
