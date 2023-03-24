package at.mathias.projects.OO_Basics.lamp;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        GlowElement glow1 = new GlowElement("Glow-Element-1", Color.red, 5);
        GlowElement glow2 = new GlowElement("Glow-Element-2", Color.blue, 5);
        GlowElement glow3 = new GlowElement("Glow-Element-3", Color.green, 5);

        Lamp lamp1 = new Lamp("Lamp1", 2);
        lamp1.addLamp(glow1);
        lamp1.addLamp(glow2);
        lamp1.addLamp(glow3);
        lamp1.turnAllOff();
        lamp1.turnAllOn();
    }

}
