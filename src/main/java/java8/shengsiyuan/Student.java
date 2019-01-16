package java8.shengsiyuan;

public class Student {
    private String name = "zhangsan";
    private int age = 20;
    private int score;


    public Student(){

    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {

        this.name = name;
        this.age = age;
        this.score = score;
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

    public static int compareStudentByScore(Student student1,Student student2){
        return student1.getScore() - student2.getScore();
    }

    public static int compartStudentByName(Student student1,Student student2){
        return student1.getName().compareTo(student2.getName());
    }
}