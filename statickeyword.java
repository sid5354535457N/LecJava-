public class statickeyword {
    public static void main(String args[]) {
        Student s1=new Student();
        s1.schoolname="kips";
        Student s2=new Student();
        System.out.println(s2.schoolname);
        Student s=new Student();
        System.out.println(s.schoolname);
        Student s3=new Student();
        s3.schoolname="kms";
        System.out.println(s3.schoolname);
        Student s4=new Student();
        System.out.println(s4.schoolname);
        System.out.println(s3.percentage(97,74,80));
    }
}
class Student {
    static int percentage(int m,int c,int p) {
        return (m+c+p)/3;
    }
    String name;
    int roll;
    static String schoolname;
    void setName(String name) {
        this.name=name;
    }
    String getName() {
        return this.name;
    }
}
