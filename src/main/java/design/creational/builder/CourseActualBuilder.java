package design.creational.builder;

public class CourseActualBuilder extends CourseBuilder{

    private Course course = new Course();

    @Override
    public void buildCouresName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCouresQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCouese() {
        return course;
    }
}