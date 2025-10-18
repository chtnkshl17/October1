package Oct14Polymorph;

public class AreaTriangle extends Shape {

    double base;
    double perpendicular;

    public AreaTriangle(double base, double perpendicular) {
        this.base = base;
        this.perpendicular = perpendicular;
    }

    @Override
    public void area() {
        System.out.println("Area of triangle : "+0.5*base*perpendicular);;
    }
}
