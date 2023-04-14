package at.mathias.projects.OO_Basics.calculator;

public class ScientificCalculator extends StandardCalculator{
    public double sine(double num) {
        double numRadian = Math.toRadians(num);
        return Math.sin(numRadian);
    }
    public double cosine(double num) {
        double numRadian = Math.toRadians(num);
        return Math.cos(numRadian);
    }
}
