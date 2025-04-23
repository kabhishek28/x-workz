package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.EducationBoard;

public class HighSchoolBoardImpl implements EducationBoard {
    public HighSchoolBoardImpl() {
        System.out.println("HighSchoolBoardImpl const");
    }

    @Override
    public void followSyllabus() {
        System.out.println("followSyllabus method in HighSchoolBoardImpl in class");
    }
}
