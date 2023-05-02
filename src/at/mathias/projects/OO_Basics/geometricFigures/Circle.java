package at.mathias.projects.OO_Basics.geometricFigures;

public class Circle extends GeometricFigure{
 private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public Circle(String name) {
        super(name);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

@Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

}

