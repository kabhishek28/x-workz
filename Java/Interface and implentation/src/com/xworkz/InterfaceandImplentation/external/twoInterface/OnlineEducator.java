package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.ELearningPlatform;
import com.xworkz.InterfaceandImplentation.RulesClass.VirtualClassroom;

public class OnlineEducator implements ELearningPlatform , VirtualClassroom {
    @Override public void enrollCourse() { System.out.println("OnlineEducator enrolling student in course."); }
    @Override public void deliverLecture() { System.out.println("OnlineEducator delivering a lecture."); }
    @Override public void gradeAssignment() { System.out.println("OnlineEducator grading assignment."); }
    @Override public void joinClass() { System.out.println("OnlineEducator joining virtual class."); }
    @Override public void participateDiscussion() { System.out.println("OnlineEducator participating in discussion."); }
    @Override public void submitAssignment() { System.out.println("OnlineEducator submitting assignments."); }

}
