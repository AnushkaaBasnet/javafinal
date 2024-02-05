package Model;

public class rectangle {
    double length;
    double breadth;
    double height;

    public rectangle(double height) {
        this.height = height;
    }

    public rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
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
        double volume =(l*b*h);
        System.out.println("The volume is"+volume);
    }

}
