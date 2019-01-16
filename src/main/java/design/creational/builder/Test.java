package design.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("java设计模式","java设计模式ppt",
        "视频","手记","问题和答案");
        System.out.println(course);
    }
}