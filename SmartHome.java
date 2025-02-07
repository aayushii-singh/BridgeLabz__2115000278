class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}


class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); 
this.temperatureSetting = temperatureSetting;
    }

    
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T1001", "On", 22.5);
        thermostat.displayStatus();
    }
}


