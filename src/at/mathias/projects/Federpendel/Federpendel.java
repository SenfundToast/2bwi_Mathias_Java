package at.mathias.projects.Federpendel;

public class Federpendel {

    // Konstanten
    private static final double G = 9.81;  // Erdbeschleunigung in m/s^2

    // Eigenschaften des Federpendels
    private double laenge;   // Länge der Feder in m
    private double masse;    // Masse des Pendelkörpers in kg
    private double federkonstante;  // Federkonstante in N/m
    private double anfangswinkel;   // Anfangswinkel in Grad
    private double anfangsgeschwindigkeit;  // Anfangsgeschwindigkeit in m/s

    // Konstruktor
    public Federpendel(double laenge, double masse, double federkonstante, double anfangswinkel, double anfangsgeschwindigkeit) {
        this.laenge = laenge;
        this.masse = masse;
        this.federkonstante = federkonstante;
        this.anfangswinkel = Math.toRadians(anfangswinkel);
        this.anfangsgeschwindigkeit = anfangsgeschwindigkeit;
    }

    // Berechnet die Bewegung des Federpendels über eine bestimmte Zeit
    public void berechneBewegung(double zeit, double schrittweite) {
        double theta = anfangswinkel;  // aktueller Winkel in Rad
        double omega = anfangsgeschwindigkeit;  // aktuelle Winkelgeschwindigkeit in rad/s
        double alpha = 0;  // aktuelle Winkelbeschleunigung in rad/s^2

        for (double t = 0; t <= zeit; t += schrittweite) {
            // Berechne neue Werte für Winkel, Winkelgeschwindigkeit und Winkelbeschleunigung
            alpha = -G / laenge * Math.sin(theta) - federkonstante / masse * theta;
            omega += alpha * schrittweite;
            theta += omega * schrittweite;

            // Ausgabe der aktuellen Werte
            System.out.println("Zeit: " + t + " s");
            System.out.println("Winkel: " + Math.toDegrees(theta) + " Grad");
            System.out.println("Winkelgeschwindigkeit: " + omega + " rad/s");
            System.out.println("Winkelbeschleunigung: " + alpha + " rad/s^2");
            System.out.println();
        }
    }

    // Hauptmethode zum Testen
    public static void main(String[] args) {
        Federpendel pendel = new Federpendel(0.5, 0.1, 10, 30, 0);
        pendel.berechneBewegung(10, 0.1);
    }
}

