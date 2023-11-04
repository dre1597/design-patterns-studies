package org.example.structural.proxy;

import org.example.structural.proxy.downloader.YoutubeDownloader;
import org.example.structural.proxy.proxy.YoutubeCacheProxy;
import org.example.structural.proxy.some_cool_media_library.ThirdPartyYouTubeClass;

public class Demo {
  public static void main(String[] args) {
    YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYouTubeClass());
    YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

    long naive = test(naiveDownloader);
    long smart = test(smartDownloader);
    System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
  }

  private static long test(YoutubeDownloader downloader) {
    long startTime = System.currentTimeMillis();

    // User behavior in our app:
    downloader.renderPopularVideos();
    downloader.renderVideoPage("catzzzzzzzzz");
    downloader.renderPopularVideos();
    downloader.renderVideoPage("dancesvideoo");
    // Users might visit the same page quite often.
    downloader.renderVideoPage("catzzzzzzzzz");
    downloader.renderVideoPage("someothervid");

    long estimatedTime = System.currentTimeMillis() - startTime;
    System.out.print("Time elapsed: " + estimatedTime + "ms\n");
    return estimatedTime;
  }
}
