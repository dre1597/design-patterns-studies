package org.example.factory_method.factory;

import org.example.factory_method.buttons.Button;

public abstract class Dialog {
  public void renderWindow() {
    Button okButton = createButton();
    okButton.onClick();
  }

  public abstract Button createButton();
}
