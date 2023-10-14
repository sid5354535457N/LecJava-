public class linearsearch {
    public static int search(int num[],int key) {
        for(int i=0;i<num.length;i++) {
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int num[]={1,2,3,4,5,6,7,8,11,14,41,62};
        int key=41;
        int index=search(num,key);
        if(index==-1){
            System.out.println("Not found");
        }
        else {
            System.out.println("index: "+index);
        }
    }
    
}
