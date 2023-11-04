package org.example.structural.facade.some_complex_media_library;

import java.io.File;

public class AudioMixer {
  public File fix(VideoFile result) {
    System.out.println("AudioMixer: fixing file...");
    return new File("tmp");
  }
}
