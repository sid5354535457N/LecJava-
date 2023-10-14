public class exarray {
    // public static boolean ex(int nums[]) {
    //     for(int i=0;i<nums.length;i++) {
    //         for(int j=i+1;j<nums.length;j++) {
    //             if(nums[i]==nums[j]) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    // public static void main(String args[]) {
    //     int nums[]={1,2,3};
    //     System.out.println(ex(nums));
    // }



    // public static int tar(int nums[],int target) {
    //     for(int i=0;i<nums.length;i++) {
    //         if(nums[i]==target) {
    //             return i;
    //         }
           
    //     }
    //     return -1;
        
    // }
    // public static void main(String args[]) {
    //     int nums[]={1,2,3,4,5,6,7,8,9};
    //     int target=11;
    //     System.out.println(tar(nums,target));
    // }


    // public static int water(int height[]) {
    //     int n=height.length;
    //     int leftmax[]=new int[n];
    //     int rightmax[]=new int[n];
    //     leftmax[0]=height[0];
    //     for(int i=1;i<n;i++) {
    //         leftmax[i]=Math.max(leftmax[i-1],height[i]);
    //     }
    //     rightmax[n-1]=height[n-1];
    //     for(int i=n-2;i>=0;i--) {
    //         rightmax[i]=Math.max(rightmax[i+1],height[i]);
    //     }
    //     int trapwater=0;
    //     for(int i=0;i<n;i++) {
    //         int waterlevel=Math.min(leftmax[i],rightmax[i]);
    //         trapwater=trapwater+(waterlevel-height[i]);
    //     }
    //     return trapwater;

    // }
    // public static void main(String args[]) {
    //     int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
    //     System.out.println(water(height));
    // }

   
    
    public static void hii(int num[]) {
        int n=num.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    if((num[i]+num[j]+num[k])==0) {
                        System.out.print("["+num[i]+","+num[j]+","+num[k]+"]"+" ");
                    }
                }
            }
        }
    }
    public static void main(String args[]) {
        int num[]={-1,0,1,2,-1,-4};
        hii(num);
    }

}
