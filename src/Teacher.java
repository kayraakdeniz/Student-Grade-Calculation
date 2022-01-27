public class Teacher {
    public String name;
    public String phoneNumber;
    public String department;
    public Teacher(String name,String phoneNumber,String department) {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.department=department;
    }

    void print() {
        System.out.println("İsim:\t"+this.name);
        System.out.println("Telefon:\t"+this.phoneNumber);
        System.out.println("Ders:\t"+this.department);
    }
}
