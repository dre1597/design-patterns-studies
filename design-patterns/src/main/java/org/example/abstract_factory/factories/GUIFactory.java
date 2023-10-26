package org.example.abstract_factory.factories;

import org.example.abstract_factory.buttons.Button;
import org.example.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
  Button createButton();

  Checkbox createCheckbox();
}
