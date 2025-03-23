package com.java.xworkz.CountryApplication.PersonalAssistant;

 class Education {

        String degree;
        String institution;
        int yearOfCompletion;


        Education(String degree, String institution, int yearOfCompletion) {
            this.degree = degree;
            this.institution = institution;
            this.yearOfCompletion = yearOfCompletion;
        }

        // Method to display Education details
        void getEducation() {
            System.out.println("-------------Education----------------");
            System.out.println("Degree: " + degree);
            System.out.println("Institution: " + institution);
            System.out.println("Year of Completion: " + yearOfCompletion);

        }
}
