public class halfpyramid {
    public static void pyr(int row) {
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=row-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        pyr(4);
    }
    
}
