package org.example.structural.composite.shapes;

import java.awt.*;

public class Circle extends BaseShape {
  public int radius;

  public Circle(int x, int y, int radius, Color color) {
    super(x, y, color);
    this.radius = radius;
  }

  @Override
  public int getWidth() {
    return 2 * radius;
  }

  @Override
  public int getHeight() {
    return 2 * radius;
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
  }
}
