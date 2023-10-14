public class copy {
    public static void main(String args[]) {
        Student s1=new Student();
        s1.name="sid";
        s1.roll=42;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=new Student(s1);
        s2.password="fuck";
        for(int i=0;i<3;i++) {
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.password);

    }
    
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];
    Student(Student s1) {
        marks=new int[3];
        this.name=name;
        this.roll=roll;
        this.marks=s1.marks;
    }
    Student() {
        marks=new int[3];
        System.out.println("hii");
    }
    Student(string name) {
        marks=new int[3];
        this.name=name;
    }
    Student(int roll) {
        marks=new int[3];
        this.roll=roll;
    }
    Student(String password) {
        marks=new int[3];
        this.password=password;
    }
}
