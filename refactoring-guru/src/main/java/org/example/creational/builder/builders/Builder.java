package org.example.creational.builder.builders;

import org.example.creational.builder.cars.CarType;
import org.example.creational.builder.components.Engine;
import org.example.creational.builder.components.GPSNavigator;
import org.example.creational.builder.components.Transmission;
import org.example.creational.builder.components.TripComputer;

public interface Builder {
  void setCarType(CarType type);

  void setSeats(int seats);

  void setEngine(Engine engine);

  void setTransmission(Transmission transmission);

  void setTripComputer(TripComputer tripComputer);

  void setGPSNavigator(GPSNavigator gpsNavigator);
}
