// Bulb.java
public class Bulb {
    private boolean isOn;

    public Bulb() {
        this.isOn = false; // Bulbs start off by default
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public String toString() {
        return isOn ? "The bulb is on." : "The bulb is off.";
    }
}
