public class SmartDevice {
    protected String name;

    public SmartDevice() {
        this.name = "Unknown";
    }

    public SmartDevice(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " is turning on.");
    }

    public final void info() {
        System.out.println("Device: " + name);
    }

    public static void category() {
        System.out.println("Smart Device");
    }
}