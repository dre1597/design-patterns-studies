package org.example.creational.abstract_factory.factories;

import org.example.creational.abstract_factory.buttons.Button;
import org.example.creational.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
  Button createButton();

  Checkbox createCheckbox();
}
