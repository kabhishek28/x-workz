package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.ContentApproval;

public class BBCApprovalImpl {
    private ContentApproval contentApproval;

    public BBCApprovalImpl(ContentApproval contentApproval) {
        this.contentApproval = contentApproval;
    }

    public void publishNews() {
        if (contentApproval != null) {
            contentApproval.approveArticle();
        } else {
            System.out.println("ContentApproval is null");
        }
    }
}