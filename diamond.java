public class exeee {
    public static void dia(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int j=1;j<i;j++) {
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int j=1;j<i;j++) {
                System.out.print("*");
            }
           
            System.out.println();

        }
    }
    public static void main(String args[]) {
        dia(7);
    }

}
