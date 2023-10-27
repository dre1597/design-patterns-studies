package org.example.structural.bridge;

import org.example.structural.bridge.devices.Device;
import org.example.structural.bridge.devices.Radio;
import org.example.structural.bridge.devices.Tv;
import org.example.structural.bridge.remotes.AdvancedRemote;
import org.example.structural.bridge.remotes.BasicRemote;

public class Demo {
  public static void main(String[] args) {
    testDevice(new Tv());
    testDevice(new Radio());
  }

  public static void testDevice(Device device) {
    System.out.println("Tests with basic remote.");
    BasicRemote basicRemote = new BasicRemote(device);
    basicRemote.power();
    device.printStatus();

    System.out.println("Tests with advanced remote.");
    AdvancedRemote advancedRemote = new AdvancedRemote(device);
    advancedRemote.power();
    advancedRemote.mute();
    device.printStatus();
  }
}
