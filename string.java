public class string {
    public static void print(String abc) {
        for(int i=0;i<abc.length();i++) {
            System.out.print(abc.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String name="Siddhant";
        String lname="Bisen";
        String fname=name+" "+lname;
        print(fname);
    }
    
}
