package org.example.abstract_factory.factories;

import org.example.abstract_factory.buttons.Button;
import org.example.abstract_factory.buttons.MacOSButton;
import org.example.abstract_factory.checkboxes.Checkbox;
import org.example.abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new MacOSButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new MacOSCheckbox();
  }
}
