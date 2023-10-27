package org.example.builder;

import org.example.builder.builders.CarBuilder;
import org.example.builder.builders.CarManualBuilder;
import org.example.builder.cars.Car;
import org.example.builder.cars.Manual;
import org.example.builder.director.Director;

public class Demo {
  public static void main(String[] args) {
    Director director = new Director();

    CarBuilder builder = new CarBuilder();
    director.constructSportsCar(builder);

    Car car = builder.getResult();
    System.out.println("Car built:\n " + car.getCarType());

    CarManualBuilder manualBuilder = new CarManualBuilder();

    director.constructSportsCar(manualBuilder);
    Manual carManual = manualBuilder.getResult();

    System.out.println("\nCar manual built:\n" + carManual.print());
  }
}
