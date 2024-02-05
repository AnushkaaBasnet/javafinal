package Model;

public class circle{
    int radius;
    double pi;

    public circle(int radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }
    public void area(){
        int radius=this.radius;
        double pi=this.pi;
        double area=(pi*radius*radius);
        System.out.println("The area is"+area);
    }
    public void volume(){
        int radius=this.radius;
        double pi=this.pi;
        double volume=(2*pi*radius);
        System.out.println("The area is"+volume);
    }
}
