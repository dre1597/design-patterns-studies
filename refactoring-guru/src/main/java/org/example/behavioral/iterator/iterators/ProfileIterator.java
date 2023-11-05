package org.example.behavioral.iterator.iterators;

import org.example.behavioral.iterator.profile.Profile;

public interface ProfileIterator {
  boolean hasNext();

  Profile getNext();

  void reset();
}
