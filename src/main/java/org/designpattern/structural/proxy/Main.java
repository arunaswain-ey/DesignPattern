package org.designpattern.structural.proxy;

import org.designpattern.structural.proxy.model.Video;

public class Main {
    public static void main(String[] args) {
        YoutubeLibrary library = new YoutubeLibProxy(new YoutubeClass());
        library.getVideo(1L);

        library.getVideo(0);
    }
}
