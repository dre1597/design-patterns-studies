package org.example.behavioral.iterator.social_networks;

import org.example.behavioral.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
  ProfileIterator createFriendsIterator(String profileEmail);

  ProfileIterator createCoworkersIterator(String profileEmail);
}
