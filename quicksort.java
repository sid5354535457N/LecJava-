public class quicksort {
    public static void quick(int arr[],int si,int ei) {
        if(si>=ei) {
            return;
        }
        int pdx=sort(arr,si,ei);
        quick(arr, si, pdx-1);
        quick(arr, pdx+1, ei);
    }
    public static int sort(int arr[],int si,int ei) {
        int pvt=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++) {
            if(arr[j]<=pvt) {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pvt;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String args[]) {
        int arr[]={6,3,9,8,2,5};
        quick(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
