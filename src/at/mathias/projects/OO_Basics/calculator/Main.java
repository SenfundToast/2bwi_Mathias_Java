package at.mathias.projects.OO_Basics.calculator;

public class Main {
    public static void main(String[] args) {

        //https://www.tutorials.de/threads/mathematische-operationen-in-java.6700/

        StandardCalculator calc = new StandardCalculator();
        ScientificCalculator science = new ScientificCalculator();
        RootCalculator root = new RootCalculator();

        System.out.println(calc.addition(2,3));
        System.out.println(calc.multiplication(3,4));
        System.out.println(science.cosine(0));
        System.out.println(root.rooting(3,3));
    }
}
