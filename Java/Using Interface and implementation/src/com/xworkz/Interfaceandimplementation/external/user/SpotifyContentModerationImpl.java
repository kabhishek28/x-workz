package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.ContentModeration;

public class SpotifyContentModerationImpl {
    private ContentModeration contentModeration;

    public SpotifyContentModerationImpl(ContentModeration contentModeration) {
        this.contentModeration = contentModeration;
    }

    public void moderateContent() {
        if (contentModeration != null) {
            contentModeration.checkExplicitContent();
        } else {
            System.out.println("ContentModeration is null");
        }
    }
}