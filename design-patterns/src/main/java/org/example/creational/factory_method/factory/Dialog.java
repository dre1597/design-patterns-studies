package org.example.creational.factory_method.factory;

import org.example.creational.factory_method.buttons.Button;

public abstract class Dialog {
  public void renderWindow() {
    Button okButton = createButton();
    okButton.onClick();
  }

  public abstract Button createButton();
}
