package org.example.structural.facade;

import org.example.structural.facade.facade.VideoConversionFacade;

import java.io.File;

public class Demo {
  public static void main(String[] args) {
    VideoConversionFacade conversionFacade = new VideoConversionFacade();
    File result = conversionFacade.convert("video.mp4", "mp4");
  }
}
