package org.example.abstract_factory.factories;

import org.example.abstract_factory.buttons.Button;
import org.example.abstract_factory.buttons.WindowsButton;
import org.example.abstract_factory.checkboxes.Checkbox;
import org.example.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckbox();
  }
}
