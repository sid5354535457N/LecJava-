public class searchsortmatrix {
    public static boolean search(int matrix[][],int key) {
        int row=0,coln=matrix[0].length-1;
        while(row<matrix.length && coln>=0) {
            if(matrix[row][coln]==key) {
                System.out.println("found at "+"("+row+","+coln+")");
                return true;
            }
            else if(key<matrix[row][coln]) {
                coln--;
            }
            else {
                row++;
            }
           
        }
        System.out.println(key+" is not found");
        return false;
    }
    public static void main(String args[]) {
        int matrix[][]={{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}};

        int key=32;
        search(matrix,key);
    }
}