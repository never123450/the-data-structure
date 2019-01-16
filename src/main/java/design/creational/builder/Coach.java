package design.creational.builder;


public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,
                             String courseViddeo,String courseArticle,
                             String courseQA){
        this.courseBuilder.buildCouresName(courseName);
        this.courseBuilder.buildCouresQA(courseQA);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseViddeo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        return this.courseBuilder.makeCouese();
    }
}