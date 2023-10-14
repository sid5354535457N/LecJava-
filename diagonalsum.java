public class diagonalsum {
    public static void sum(int matrix[][]) {
        int sum=0;
        int n=matrix.length-1;
        for(int i=0;i<matrix.length;i++) {
            sum=sum+matrix[i][i];
            if(i!=n-i) {
                sum=sum+matrix[i][n-i];
            }
        }
        System.out.print(sum);

    }
    public static void main(String args[]) {
        int matrix[][]={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                          {13,14,15,16}};
        sum(matrix);
    }
}