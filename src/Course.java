public class Course {
    public String name;
    public String code;
    public String prefix;
    int note;
    Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    public void addTeacher(Teacher teacher) {
        if (teacher.department.equals(this.prefix)) {
            this.teacher = teacher;
        } else
            System.out.println("Öğretmen ve ders bilgileri uyuşmuyor!");
    }

    public void printTeacher() {
        if (this.teacher != null) {
            this.teacher.print();
        }
    }
}
