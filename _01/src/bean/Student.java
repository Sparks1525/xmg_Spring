package bean;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {
        System.out.println("Student constructor");
    }

    public void init(){
        System.out.println("Student init");
    }

    public void close(){
        System.out.println("Student close");
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
