package design.behavior.templateMethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start-----");
        ACOurse designPatternCoursr = new DesignPatternCourse();
        designPatternCoursr.makeCourse();
        System.out.println("后端设计模式课程end-----");


        System.out.println("前端课程start-----");
        ACOurse feCourse = new FECourse();
        feCourse.makeCourse();
        System.out.println("前端课程end-----");

    }
}