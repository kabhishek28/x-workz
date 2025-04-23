package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.ExamPolicy;

public class CBSEExamImpl {
    private ExamPolicy examPolicy;

    public CBSEExamImpl(ExamPolicy examPolicy) {
        this.examPolicy = examPolicy;
    }

    public void organizeExam() {
        if (examPolicy != null) {
            examPolicy.conductExam();
        } else {
            System.out.println("ExamPolicy is null");
        }
    }
}

