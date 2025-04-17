package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.SocialMediaPlatform;

public class MySocialPlatform implements SocialMediaPlatform {
    @Override
    public void postStatus() {
        System.out.println("Posting a new status on MySocialPlatform.");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending a direct message on MySocialPlatform.");
    }

    @Override
    public void shareContent() {
        System.out.println("Sharing content on MySocialPlatform.");
    }
}