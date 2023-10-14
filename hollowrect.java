public class hollowrect {
    public static void holo(int row,int coln) {
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=coln;j++) {
                if(i==1||i==row||j==1||j==coln) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]) {
        holo(4,5);
    }
    
}
