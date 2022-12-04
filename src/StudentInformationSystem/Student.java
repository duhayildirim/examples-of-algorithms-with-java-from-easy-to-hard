package StudentInformationSystem;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if ((note1 + note2 + note3) > 0 && (note1 + note2 + note3) <= 300) {
            this.course1.note = note1;
            this.course2.note = note2;
            this.course3.note = note3;
        } else {
            System.out.println("check the notes entered");
        }
    }

    void printNote() {
        System.out.println(this.course1.name + this.course1.note);
        System.out.println(this.course2.name + this.course2.note);
        System.out.println(this.course3.name + this.course3.note);
    }

    void calcAverage() {
        this.average = (this.course1.note + this.course2.note + this.course3.note) / 3.0;
    }

    public void isPass() {
        if (this.course1.note == 0 || this.course2.note == 0 || this.course3.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

}
