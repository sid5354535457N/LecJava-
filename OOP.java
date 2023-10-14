public class OOP {
    public static void main(String args[]) {
        Pen p1=new Pen();
        Student s1=new Student();
        p1.Color="Blue";
        p1.Tip=5;
        s1.name="sid";
        
        s1.calcper(80,74,95);
        System.out.println(p1.Color);
        System.out.println(p1.Tip);
        System.out.println(s1.percentage);
        System.out.println(s1.name);

    }
    
}
class Pen {
    String Color;
    int Tip;
    void setcolor(String newColor) {
        Color=newColor;
    }
    void setTip(int newTip) {
        Tip=newTip;
    }
}
class Student {
    String name;
    int age;
    float percentage;
    void calcper(int phy,int che,int math) {
        percentage=(phy+che+math)/3;
    }
}
