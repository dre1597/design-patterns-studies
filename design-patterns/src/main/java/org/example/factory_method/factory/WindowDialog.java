package org.example.factory_method.factory;

import org.example.factory_method.buttons.Button;
import org.example.factory_method.buttons.WindowsButton;

public class WindowDialog extends Dialog {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
