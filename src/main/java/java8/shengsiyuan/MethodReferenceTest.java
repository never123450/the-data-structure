package java8.shengsiyuan;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",19);
        Student student2 = new Student("lisi",90);
        Student student3 = new Student("wangwu",50);
        Student student4 = new Student("zhaoliu",40);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);

        students.sort((studentParameter1,studentParamer2) -> Student.compareStudentByScore(studentParameter1,studentParamer2));
        students.forEach(System.out::println);

        System.out.println("------------");
        students.sort(Student::compareStudentByScore);
        students.forEach(System.out::println);
    }
}