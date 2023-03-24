package at.mathias.projects.OO_Basics.lamp;

import at.mathias.projects.OO_Basics.carBasic.RearMirror;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private String nameOfLamp;
    public GlowElement getNameOfGlowElements;
    private List<GlowElement> glowElements;
    private double totalPowerConsumption = 0;


    public Lamp(String name, double totalPowerConsumption) {
        this.nameOfLamp = name;
        this.glowElements = new ArrayList<>();
        this.totalPowerConsumption = totalPowerConsumption;
    }

    public void addLamp(GlowElement glowElement) {
        this.glowElements.add(glowElement);
    }

    public GlowElement getGetNameOfGlowElements() {
        return getNameOfGlowElements;
    }

    public void setGetNameOfGlowElements(GlowElement getNameOfGlowElements) {
        this.getNameOfGlowElements = getNameOfGlowElements;
    }

    public String getNameOfLamp() {
        return nameOfLamp;
    }

    public void setNameOfLamp(String nameOfLamp) {
        this.nameOfLamp = nameOfLamp;
    }

    public List<GlowElement> getGlowElements() {
        return glowElements;
    }

    public void setGlowElements(List<GlowElement> glowElements) {
        this.glowElements = glowElements;
    }

    public double getTotalPowerConsumption() {
        return totalPowerConsumption;
    }

    public void setTotalPowerConsumption(double totalPowerConsumption) {
        this.totalPowerConsumption = totalPowerConsumption;
    }

    public void turnAllOn() {
        for (int i = 0; i < glowElements.size(); i++) {
            if (this.glowElements.get(i).isOn()) {
                System.out.println("My name is " + this.glowElements.get(i).getNameOfGlowElement() + ". I am already on.");
                continue;
            }
            this.glowElements.get(i).turnOn();
            this.glowElements.get(i).setTotalPowerConsumption(this.glowElements.get(i).getTotalPowerConsumption() + this.glowElements.get(i).getPowerConsumption());
        }
    }

    public void turnAllOff() {
        for (int i = 0; i < glowElements.size(); i++) {
            if (!this.glowElements.get(i).isOn()) {
                System.out.println("My name is " + this.glowElements.get(i).getNameOfGlowElement() + ". I am already off.");
                continue;
            }
            this.glowElements.get(i).turnOff();
        }
    }

    public double getOverallPowerConsumption() {
        double overallPowerConsumption = 0;
        for (int i = 0; i < glowElements.size(); i++) {
            overallPowerConsumption += this.glowElements.get(i).getTotalPowerConsumption();
        }
        return overallPowerConsumption;
    }

    public void printNamesOfLightElements() {
        for (int i = 0; i < glowElements.size(); i++) {
            System.out.println(this.glowElements.get(i).getNameOfGlowElement());
        }
    }


}
