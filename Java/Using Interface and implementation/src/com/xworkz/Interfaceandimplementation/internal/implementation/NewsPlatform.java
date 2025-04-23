package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.ContentApproval;

public class NewsPlatform implements ContentApproval {
    @Override
    public void approveArticle() {
        System.out.println("News platform approves articles before publishing.");
    }
}
