public class funprime {
    /*public static boolean hii(int n) {
        boolean hii=true;
        for(int i=2;i<=n-1;i++) {
            if(n%i==0) {
                hii=false;
                break;
            }
       
        }
        return hii;
       
    }
    public static void main(String args[]) {
        System.out.println(hii(6)); 
    }*/

    public static boolean hii(int n) {
       
        if(n==2){
           return true;

        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
               return false;
            }
        }
        return true; 
    }
    public static void main(String args[]){
        System.out.println(hii(15));
    }

}
