package StudentInformationSystem;

public class Main {
    //    Student Grading System
//    Lesson Class Features:
//    Attributes: name, code, prefix, grade, Teacher
//    Methods: Course() , addTeacher() , printTeacher()
//
//    Teacher Class Features:
//    Attributes: name,mpno,branch
//    Methods : Teacher()
//
//    Student Class Features:
//    Qualifications : name,stuNo,classes,course1,course2,course3,average,isPass
//    Methods: Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
//
//    Enter the glossary part of the course belonging to the course class and a separate expression for each course
//    for the average. Include your oral grades with the percentage impact on the average.
//    Example: If the effect of the oral grade of the physics course is 20% on the average, the effect of the exam grade is 80%.
//    If the student got 90 from the dictionary and 60 from the exam, it removes the effect of that course on the overall average as follows:
//    Physics Average: (90 * 0.20) + (60 * 0.80);
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Duha", "d31", "05222699889");
        Teacher t2 = new Teacher("Selin", "d32", "0526499889");
        Teacher t3 = new Teacher("Lex", "d33", "05229839889");

        Course c1 = new Course("Math", "m101", "d32");
        Course c2 = new Course("History", "h101", "d31");
        Course c3 = new Course("Software", "s101", "d33");
        c1.addTeacher(t2);
        c2.addTeacher(t1);
        c3.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "4", "140144015", c1, c2, c3);
        s1.addBulkExamNote(50, 20, 40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "4", "2211133", c1, c2, c3);
        s2.addBulkExamNote(100, 50, 40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "4", "221121312", c1, c2, c3);
        s3.addBulkExamNote(50, 20, 40);
        s3.isPass();
    }
}
