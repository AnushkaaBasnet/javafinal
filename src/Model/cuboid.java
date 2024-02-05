package Model;

public class cuboid extends rectangle{
    public cuboid(double length, double breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public int height;
    public void area(){
        double l=this.length;
        double b=this.breadth;
        double area=(l*b);
        System.out.println("The area is"+area);
    }
    public void volume(){
        double l=this.length;
        double b=this.breadth;
        double h=this.height;
        double volume =(2*(l*b+b*h+h*l));
        System.out.println("The volume is"+volume);
    }

}
