package at.mathias.projects.OO_Basics.Calculator;

public class ScientificCalculator {
    public double sine(double num) {
        double numRadian = Math.toRadians(num);
        return Math.sin(numRadian);
    }
    public double cosine(double num) {
        double numRadian = Math.toRadians(num);
        return Math.cos(numRadian);
    }
}
