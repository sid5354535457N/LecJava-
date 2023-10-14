
import java.util.*;
public class oopexe {
    public static void main(String args[]) {
        Num c=new Num(4,5);
        Num d=new Num(9,4);
        Num e=Num.add(c,d);
        Num f=Num.sub(c,d);
        Num g=Num.product(c,d);
        e.print();
        f.print();
        g.print();
    }

}
class Num {
    int real;
    int imag;
    public Num(int r,int i) {
        real=r;
        imag=i;
    }
    public static Num add(Num a,Num b) {
        return new Num((a.real+b.real),(a.imag+b.imag));
    }
    public static Num sub(Num a,Num b) {
        return new Num((a.real-b.real),(a.imag-b.imag));
    }
    public static Num product(Num a,Num b) {
        return new Num((a.real*b.real)-(a.imag*b.imag),(a.real*b.imag)+(a.imag*b.real));
    }
    
    public void print() {
        if(real==0 && imag!=0) {
            System.out.println(imag+"i");
        }
        else if(real!=0 && imag==0) {
            System.out.println(real);
        }
        else {
            System.out.println(real+"+"+imag+"i");
        }
    }
}