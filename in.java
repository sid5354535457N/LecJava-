public class in {
    public class Box {
        double l;
        double b;
        double w;
    }
    Box () {
        this.l=-1;
        this.b=-1;
        this.w=-1;
    }
    Box(double side) {
        this.w=side;
        this.l=side;
        this.b=side;
    }
    Box (double l,double b,double w) {
        this.l=l;
        this.b=b;
        this.w=w;
    }
    public static void main(String[] args) {
        Box box=new Box();
        System.out.println(box.l+" "+box.b+" "+box.w);
        
    }
    
}
