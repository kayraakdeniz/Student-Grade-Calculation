public class Student {
    String name;
    String studentNumber;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;

    public Student(String name, String studentNumber,String classes, Course c1, Course c2, Course c3 ) {
        this.name=name;
        this.studentNumber=studentNumber;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;
    }

    void adddBulkExamNote(int note1, int note2,int note3) {
        this.c1.note=note1;
        this.c2.note=note2;
        this.c3.note=note3;
        this.average=(this.c1.note+this.c2.note+this.c3.note)/3;
        if (this.average >= 55) {
            this.isPass = true;
            System.out.println("Geçtiniz!");
        } else {
            this.isPass = false;
            System.out.println("Kaldınız!");
        }
        print();
    }

    void print() {
        System.out.println(this.c1.name+" dersinin notu:\t"+this.c1.note);
        System.out.println(this.c2.name+" dersinin notu:\t"+this.c2.note);
        System.out.println(this.c3.name+" dersinin notu:\t"+this.c3.note);
    }
}
