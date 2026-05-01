class Appliance extends SmartDevice {
    protected int power;

    public Appliance(String name, int power) {
        super(name);
        this.power = power;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Power: " + power + "W");
    }

    public static void category() {
        System.out.println("Appliance");
    }
}


class WashingMachine extends Appliance {
    public WashingMachine(String name, int power) {
        super(name, power);
    }

    @Override
    public void turnOn() {
        System.out.println(name + " washing machine is ON");
    }
}

class LightDevice extends SmartDevice {
    public LightDevice(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(name + " light is ON");
    }
}

final class Hub {
    public void connect() {
        System.out.println("Devices connected");
    }
}