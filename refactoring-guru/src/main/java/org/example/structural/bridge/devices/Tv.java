package org.example.structural.bridge.devices;

public class Tv implements Device {
  private boolean on = false;
  private int volume = 30;
  private int channel = 1;

  @Override
  public boolean isEnabled() {
    return on;
  }

  @Override
  public void enable() {
    on = true;
  }

  @Override
  public void disable() {
    on = false;
  }

  @Override
  public int getVolume() {
    return volume;
  }

  @Override
  public void setVolume(int percent) {
    if (volume > 100) {
      volume = 100;
    } else if (volume < 0) {
      volume = 0;
    }
    volume = volume + percent;
  }

  @Override
  public int getChannel() {
    return channel;
  }

  @Override
  public void setChannel(int channel) {
    this.channel = channel;
  }

  @Override
  public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("TV is " + (on ? "on" : "off"));
    System.out.println("Volume is " + volume + "%");
    System.out.println("Channel is " + channel);
    System.out.println("------------------------------------\n");
  }
}
