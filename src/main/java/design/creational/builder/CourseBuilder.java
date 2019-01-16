package design.creational.builder;

public abstract class CourseBuilder {

    public abstract void buildCouresName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCouresQA(String courseQA);


    public abstract Course makeCouese();

}