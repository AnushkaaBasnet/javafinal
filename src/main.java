import Model.circle;
import Model.cylinder;
import Model.rectangle;
import Model.cuboid;
import Model.member;
import Model.employee;
import Model.manager;

public class main {
    public static void main(String[] args) {
        circle c1 = new circle(20, 3.14 );
        cylinder cy = new cylinder(45, 3.14, 7);
        c1.area();
        c1.volume();
        cy.area();
        c1.volume();

    }
}
