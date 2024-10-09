import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class NetworkDevice {
    private String modelName;
    private String deviceName;


    private String macAddress;
    private String ipV4;
    private String ipV6;
    private List<String> connections;


    private int vlan;


    private List<Module> modules;


    /* Network Device Router */
    public NetworkDevice(String deviceName, String macAddress, String ipV4, List<String> connections, int vlan, List<Module> modules) {
        this.modelName = modelName;
        this.deviceName = deviceName;
        this.macAddress = macAddress;
        this.ipV4 = ipV4;
        this.vlan = vlan;
        this.connections = new ArrayList<>();
        this.modules = new ArrayList<>();
    }

    public String showRunning() {
        String result = modelName != null ? modelName + " " : "Device ";
        if (deviceName != null) result += deviceName;
        result += " {\n";


        if (macAddress != null) result += "\tMac Address: " + macAddress + "\n";
        if (ipV4 != null) result += "\tIP Address V4: " + ipV4 + "\n";
        if (ipV6 != null) result += "\tIP Address V6: " + ipV6 + "\n";
        if (vlan > 0) result += "\tVLAN: " + vlan + "\n";
        if (connections != null && !connections.isEmpty()) {
            result += "\tConnections: [\n";
            for (String c : connections) result += "\t\t" + c + "\n";
            result += "\t]\n";
        }
        if (modules != null && !modules.isEmpty()) {
            result += "\tConnections: [\n";
            for (Module c : modules) result += "\t\t" + c + "\n";
            result += "\t]\n";
        }


        result += "}\n";


        System.out.println(result);
        return result;
    }

    /* https://stackoverflow.com/questions/24261027/make-a-random-mac-address-generator-generate-just-unicast-macs
     */
    public static String randomMACAddress() {
        Random rand = new Random();
        byte[] macAddr = new byte[6];
        rand.nextBytes(macAddr);
        macAddr[0] = (byte) (macAddr[0] & (byte) 254);
        StringBuilder sb = new StringBuilder(18);
        for (byte b : macAddr) {
            if (!sb.isEmpty()) sb.append(":");
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getIpV4() {
        return ipV4;
    }

    public void setIpV4(String ipV4) {
        this.ipV4 = ipV4;
    }

    public String getIpV6() {
        return ipV6;
    }

    public void setIpV6(String ipV6) {
        this.ipV6 = ipV6;
    }

    public List<String> getConnections() {
        return connections;
    }

    public void setConnections(List<String> connections) {
        this.connections = connections;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public int getVlan() {
        return vlan;
    }

    public void setVlan(int vlan) {
        this.vlan = vlan;
    }

    public boolean addModule(Module module) {
        return modules.add(module);
    }

    public boolean removeModule(Module module) {
        return modules.remove(module);
    }
}
