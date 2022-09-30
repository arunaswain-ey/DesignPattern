package org.designpattern.structural.proxy;

import org.designpattern.structural.proxy.model.Video;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class YoutubeClass implements YoutubeLibrary {

    public YoutubeClass() {
        System.out.println("Service Called");
    }

    @Override
    public List<Video> listVideos() {
        return Stream.of(new Video(1L, "Video 1", LocalDateTime.now(), 4),
                        new Video(2L, "Video 2", LocalDateTime.now(), 5),
                        new Video(3L, "Video 3", LocalDateTime.now(), 2))
                .collect(Collectors.toList());
    }

    @Override
    public Video getVideo(long ID) {
        Video result = listVideos().stream().filter(video -> video.getID() == ID).findFirst().get();
        System.out.println(result);
        return result;
    }
}
