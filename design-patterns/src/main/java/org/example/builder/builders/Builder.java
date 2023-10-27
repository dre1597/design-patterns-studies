package org.example.builder.builders;

import org.example.builder.cars.CarType;
import org.example.builder.components.Engine;
import org.example.builder.components.GPSNavigator;
import org.example.builder.components.Transmission;
import org.example.builder.components.TripComputer;

public interface Builder {
  void setCarType(CarType type);

  void setSeats(int seats);

  void setEngine(Engine engine);

  void setTransmission(Transmission transmission);

  void setTripComputer(TripComputer tripComputer);

  void setGPSNavigator(GPSNavigator gpsNavigator);
}
