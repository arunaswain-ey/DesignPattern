package org.designpattern.structural.proxy;

import org.designpattern.structural.proxy.model.Video;

import java.util.List;

public interface YoutubeLibrary {
    public List<Video> listVideos();

    public Video getVideo(long ID);
}
