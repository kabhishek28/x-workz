package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.EducationBoard;

public class School {
    private EducationBoard  educationBoard;

    public School(EducationBoard educationBoard) {
        this.educationBoard = educationBoard;
    }

    public void getEducationBroad(){
        if(educationBoard != null){
            educationBoard.followSyllabus();
        }else {
            System.out.println("educationBoard is null");
        }
    }
}
