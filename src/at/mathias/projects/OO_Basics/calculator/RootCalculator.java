package at.mathias.projects.OO_Basics.calculator;

public class RootCalculator extends StandardCalculator{
    public double rooting(double num, double numberOfRoot) {
        return Math.pow(num, 1  / numberOfRoot);
    }
}
