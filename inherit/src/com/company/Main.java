package com.company;

public class Main {

    public static void main(String[] args) {
        Student student=new Student();
        student.setFirstname("Intizar");
        student.setSurname("Aliyeva");
        student.setEmail("intizar.aliyeva69@gmail.com");
        student.setSchoolName("12234");
        System.out.println(student.getFirstname());
        System.out.println(student.getSurname());
        System.out.println(student.getEmail());
        System.out.println(student.getSchoolName());
        Instructor i̇nstructor=new Instructor();
        i̇nstructor.setFirstname("Hocam");
        i̇nstructor.setSurname("Hoca");
        i̇nstructor.setEmail("hocam.hoca@gmail.com");
        i̇nstructor.setJobName("programmer");
        System.out.println(i̇nstructor.getFirstname());
        System.out.println(i̇nstructor.getSurname());
        System.out.println(i̇nstructor.getEmail());
        System.out.println(i̇nstructor.getJobName());
        UserManager userManager=new UserManager();

        User [] user={student,i̇nstructor};
        userManager.addMultiple(user);
    }
}
