public class revise {
    // public static int search(int num[],int key) {
    //     int start=0;
    //     int end=num.length-1;
    //     while(start<=end) {
    //         int mid=(start+end)/2;
    //         if(num[mid]==key) {
    //             return mid;
    //         }
    //         else if(num[mid]>key) {
    //             end=mid-1;

    //         }
    //         else{
    //             start=mid+1;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String args[]) {
    //     int num[]={1,2,3,4,5,6};
    //     int key=5;
    //     System.out.println(search(num,key));
    // }
    // public static void reverse(int num[]) {
    //     int first=0;
    //     int last=num.length-1;
    //     while(first<last) {
    //         int temp=num[last];
    //         num[last]=num[first];
    //         num[first]=temp;
    //         first++;
    //         last--;
    //     }
    // }
    // public static void main(String args[]) {
    //     int num[]={1,2,3,4,5};
    //     reverse(num);
    //     for(int i=0;i<num.length;i++) {
    //         System.out.print(num[i]+" ");
    //     }
    //     System.out.println();

    // }
    public static void pair(int num[]) {
        int tp=0;
        for(int i=0;i<num.length;i++) {
            for(int j=i+1;j<num.length;j++) {
                System.out.print("("+num[i]+","+num[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String args[]) {
        int num[]={1,2,3,4,5,6};
        pair(num);
    }
}
