import java.util.*;
public class spiralmatrix {
    public static void printspiral(int matrix[][]) {
        int startrow=0;
        int startcoln=0;
        int endrow=matrix.length-1;
        int endcoln=matrix[0].length-1;
        while(startrow<=endrow && startcoln<=endcoln) {
            for(int j=startcoln;j<=endcoln;j++) {
                System.out.print(matrix[startrow][j]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++) {
                System.out.print(matrix[i][endcoln]+" ");
            }
            for(int j=endcoln-1;j>=startcoln;j--) {
                System.out.print(matrix[endrow][j]+" ");
            }
            for(int i=endrow-1;i>=startrow+1;i--) {
                System.out.print(matrix[i][startcoln]+" ");
            }
            
            startrow++;
            startcoln++;
            endrow--;
            endcoln--;
        }
        System.out.println();
        
    }
    public static void main(String args[]) {
       int matrix[][]={{1,2,3,4,100},
                        {5,6,7,8,44},
                        {9,10,11,12,55},
                        {22,33,88,99,123},
                        {13,14,15,16,66}};
        printspiral(matrix);

    }
}