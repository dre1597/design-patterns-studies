package org.example.behavioral.mediator.components;

import org.example.behavioral.mediator.mediator.Mediator;

public interface Component {
  void setMediator(Mediator mediator);

  String getName();
}
