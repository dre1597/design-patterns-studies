package org.example.creational.factory_method;

import org.example.creational.factory_method.factory.Dialog;
import org.example.creational.factory_method.factory.HtmlDialog;
import org.example.creational.factory_method.factory.WindowDialog;

public class Demo {
  private static Dialog dialog;

  public static void main(String[] args) {
    configure();
    runBusinessLogic();
  }

  static void configure() {
    if (System.getProperty("os.name").equals("Windows 11")) {
      dialog = new WindowDialog();
    } else {
      dialog = new HtmlDialog();
    }
  }

  static void runBusinessLogic() {
    dialog.renderWindow();
  }
}
