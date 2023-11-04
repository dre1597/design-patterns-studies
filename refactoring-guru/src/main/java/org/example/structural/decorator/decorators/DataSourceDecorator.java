package org.example.structural.decorator.decorators;

public class DataSourceDecorator implements DataSource {
  private DataSource wrapper;

  DataSourceDecorator(DataSource wrapper) {
    this.wrapper = wrapper;
  }

  @Override
  public void writeData(String data) {
    wrapper.writeData(data);
  }

  @Override
  public String readData() {
    return wrapper.readData();
  }
}
