public class decTonum {
    public static void decTobi(int decNum) {
        int mynum=decNum;
        int pow=0;
        int binNum=0;
        while(decNum>0) {
            int rim=decNum%2;
            binNum=binNum+(rim*(int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;
        }
        System.out.println("binary no. of "+mynum+"="+binNum);
    }
    public static void main(String argsp[]) {
        decTobi(13);
    }
    
}
