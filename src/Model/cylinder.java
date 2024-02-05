package Model;

public class cylinder extends circle {
    public int height;

    public cylinder(int radius, double pi, int height) {
        super(radius, pi);
        this.height= height;

    }
    public void area(){
        int radius=this.radius;
        double pi=this.pi;
        int height=this.height;
        double area=(2*pi*radius*height+2*pi*radius*radius);
        System.out.println("The area is"+area);
    }
    public void volume(){
        int radius=this.radius;
        double pi=this.pi;
        int height=this.height;
        double volume=(pi*radius*radius*height);
        System.out.println("The area is"+volume);
    }
}


