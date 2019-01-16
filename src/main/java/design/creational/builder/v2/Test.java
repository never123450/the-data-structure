package design.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseArticle("文章")
                .buildCoursePPT("ppt").buildCourseVideo("视频").builderCourseName("java设计模式")
                .buildCouresQA("问题和答案").build();
        System.out.println(course);
    }
}