package org.designpattern.structural.proxy;

import lombok.Data;
import org.designpattern.structural.proxy.model.Video;

import java.util.List;

@Data
public class YoutubeLibProxy implements YoutubeLibrary {

    private YoutubeLibrary service;

    public YoutubeLibProxy(YoutubeLibrary library) {
        this.service = library;
    }

    @Override
    public List<Video> listVideos() {
        return null;
    }

    @Override
    public Video getVideo(long ID) {
        if (validateRequest(ID)) {
            service.getVideo(ID);
        }
        return null;
    }

    private boolean validateRequest(long ID) {
        if (ID < 1 || ID > 3) {
            return false;
        }
        return true;
    }
}
