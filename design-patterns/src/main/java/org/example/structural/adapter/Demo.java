package org.example.structural.adapter;

import org.example.structural.adapter.adpters.SquarePegAdapter;
import org.example.structural.adapter.round.RoundHole;
import org.example.structural.adapter.round.RoundPeg;
import org.example.structural.adapter.square.SquarePeg;

public class Demo {
  public static void main(String[] args) {
    RoundHole roundHole = new RoundHole(5);
    RoundPeg roundPeg = new RoundPeg(5);

    if (roundHole.fits(roundPeg)) {
      System.out.println("The round peg with radius 5 fits in the round hole with radius 5.");
    }

    SquarePeg smallSqPeg = new SquarePeg(2);
    SquarePeg largeSqPeg = new SquarePeg(20);
    // hole.fits(smallSqPeg); // Won't compile

    SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
    SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
    if (roundHole.fits(smallSqPegAdapter)) {
      System.out.println("Square peg with width 2 fits round hole with radius 5.");
    }
    if (!roundHole.fits(largeSqPegAdapter)) {
      System.out.println("Square peg with width 20 does not fit into round hole with radius 5.");
    }
  }
}
