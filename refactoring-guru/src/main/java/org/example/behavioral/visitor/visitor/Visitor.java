package org.example.behavioral.visitor.visitor;

import org.example.behavioral.visitor.shapes.Circle;
import org.example.behavioral.visitor.shapes.CompoundShape;
import org.example.behavioral.visitor.shapes.Dot;
import org.example.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
  String visitDot(Dot dot);

  String visitCircle(Circle circle);

  String visitRectangle(Rectangle rectangle);

  String visitCompoundGraphic(CompoundShape cg);
}
