package org.example.factory_method.factory;

import org.example.factory_method.buttons.Button;
import org.example.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}
