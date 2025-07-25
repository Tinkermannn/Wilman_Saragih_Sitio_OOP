import java.util.List;

public class NetworkDeviceBuilder {
    private String modelName;
    private String deviceName;


    private String macAddress;
    private String ipV4;
    private String ipV6;
    private List<String> connections;


    private int vlan;


    private List<Module> modules;

    public void turnOff() {
        this.modelName = null;
        this.deviceName = null;
        this.macAddress = null;
        this.ipV4 = null;
        this.ipV6 = null;
        this.connections = null;
        this.vlan = 0;
        this.modules = null;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public void setIpV4(String ipV4) {
        this.ipV4 = ipV4;
    }

    public void setIpV6(String ipV6) {
        this.ipV6 = ipV6;
    }

    public void setConnections(List<String> connections) {
        this.connections = connections;
    }

    public void setVlan(int vlan) {
        this.vlan = vlan;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public NetworkDevice turnOn() {
        return new NetworkDevice(deviceName,macAddress, ipV4, connections, vlan, modules);
    }
}
