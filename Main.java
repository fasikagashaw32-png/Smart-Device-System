public class Main {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine("LG", 500);
        wm.turnOn();
        wm.info();

        LightDevice light = new LightDevice("Room");
        light.turnOn();

        SmartDevice.category();
        Appliance.category();

        Hub hub = new Hub();
        hub.connect();


    }
}