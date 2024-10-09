import java.util.List;

public class Topology {
    public NetworkDevice addRouterv4(NetworkDeviceBuilder builder, String deviceName,String ipV4){
        builder.turnOff();
        builder.setModelName("Netlab Router");
        builder.setDeviceName(deviceName);
        builder.setIpV4(ipV4);
        builder.setMacAddress(NetworkDevice.randomMACAddress());
        return builder.turnOn();
    }

    public NetworkDevice addSwitch(NetworkDeviceBuilder builder, String deviceName, int vlan){
        builder.turnOff();
        builder.setModelName(deviceName);
        builder.setMacAddress(NetworkDevice.randomMACAddress());
        builder.setVlan(vlan);
        return builder.turnOn();
    }

    public NetworkDevice addPCv4(NetworkDeviceBuilder builder, String deviceName, String ipV4){
        builder.turnOff();
        builder.setModelName("Netlab PC");
        builder.setDeviceName(deviceName);
        builder.setMacAddress(NetworkDevice.randomMACAddress());
        builder.setIpV4(ipV4);
        return builder.turnOn();
    }
}
