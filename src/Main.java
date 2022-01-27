public class Main {

    public static void main(String[] args) {
        Teacher physicsTeacher=new Teacher("Albert Einstein","5623","physics");
        Teacher mathTeacher=new Teacher("Pisagor","5044","math");
        Teacher biologyTeacher=new Teacher("Uğur Şahin","5908","bio");

        Course math=new Course("MATH","101","math");
        Course physics=new Course("PHYSICS","102","physics");
        Course biology=new Course("BIOLOGY","103","bio");

        math.addTeacher(mathTeacher);
        physics.addTeacher(physicsTeacher);
        biology.addTeacher(biologyTeacher);

        Student s1=new Student("John","1705","4",math, physics,biology);
        s1.adddBulkExamNote(55,55,54);
    }
}
