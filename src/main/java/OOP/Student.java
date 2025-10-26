package OOP;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnroled;

    public Student(){};

    public Student(String name, int age, double gpa, boolean isEnroled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnroled = isEnroled;
    }

    public void study(){
        System.out.println(this.name + " is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", isEnroled=" + isEnroled +
                '}';
    }
}
