package Binary_Search_Test;

public class Student {
    public static int autoId;
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age){
        if(Student.autoId < 0) Student.autoId = 0;
        this.id = Student.autoId++;
        this.name = name;
        this.age = age;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Student.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.print("\nId:" + this.id);
        System.out.print("\nName:" + this.name);
        System.out.print("\nAge:" + this.age);
        System.out.print("\n----------------");
    }
}
