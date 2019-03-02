package bean;

public class Teacher {

    private int id;
    private String name;
    private int age;


    public Teacher() {
        System.out.println("Teacher constructor");
    }

    public void init(){
        System.out.println("Teacher init");
    }

    public void close(){
        System.out.println("Teacher close");
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
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
