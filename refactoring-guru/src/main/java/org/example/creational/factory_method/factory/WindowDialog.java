package org.example.creational.factory_method.factory;

import org.example.creational.factory_method.buttons.Button;
import org.example.creational.factory_method.buttons.WindowsButton;

public class WindowDialog extends Dialog {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
