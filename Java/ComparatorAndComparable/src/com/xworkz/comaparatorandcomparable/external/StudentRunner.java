package com.xworkz.comaparatorandcomparable.external;

import com.xworkz.comaparatorandcomparable.dto.StudentDTO;

import java.util.*;

public class StudentRunner {
    public static void main(String[] args) {


        StudentDTO studentDTO = new StudentDTO("Abhi",50);
        StudentDTO studentDTO1 = new StudentDTO("vinith" , 75);
        StudentDTO studentDTO2 = new StudentDTO("vinutha",66);
        StudentDTO studentDTO3 = new StudentDTO("viji",85);
        StudentDTO studentDTO4 = new StudentDTO("Harsha" , 90);



        Comparator<StudentDTO> comparator = new Comparator<StudentDTO>() {


            @Override
            public int compare(StudentDTO o1, StudentDTO o2) {

                if(o1.getMarks() > o2.getMarks()){
                    return 1;
                } else if (o1.getMarks() < o2.getMarks()) {
                    return -1;
                }else {
                    return 0;
                }

            }
        };

        List<StudentDTO> collection = new ArrayList<>();
        collection.add(studentDTO);
        collection.add(studentDTO1);
        collection.add(studentDTO2);
        collection.add(studentDTO3);
        collection.add(studentDTO4);
        System.out.println(collection);
        Collections.sort(collection,comparator);

        System.out.println("**********************\n"+collection);
    }
}
