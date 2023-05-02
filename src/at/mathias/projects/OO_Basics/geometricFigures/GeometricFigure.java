package at.mathias.projects.OO_Basics.geometricFigures;

public class GeometricFigure {
    private String name;
    private double area;

    public GeometricFigure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
            this.area = area;
    }
}
