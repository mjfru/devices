public class Device {
    protected int batteryLife = 100;

    public String getBatteryLife() {
        return ("Battery is at " + this.batteryLife + "%.");
    }
}