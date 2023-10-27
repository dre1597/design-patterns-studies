package org.example.structural.adapter.adpters;

import org.example.structural.adapter.round.RoundPeg;
import org.example.structural.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
  private SquarePeg peg;

  public SquarePegAdapter(SquarePeg peg) {
    this.peg = peg;
  }

  @Override
  public double getRadius() {
    return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
  }
}
