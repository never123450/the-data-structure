package design.dependenceInVersion;

public class Test {
    public static void main(String[] args) {

        //v1
//        Xwy xwy = new Xwy();
//        xwy.studyFECourse();
//        xwy.studyJavaCourse();

//        //v2
//        Xwy xwy = new Xwy();
//        xwy.studyXwyCourse(new JavaCourse());
//        xwy.studyXwyCourse(new EFCourse());

        //v3
//        Xwy xwy = new Xwy(new JavaCourse());
//        xwy.studyXwyCourse();


        //v4
        Xwy xwy = new Xwy();
        xwy.setIcourse(new JavaCourse());
        xwy.studyXwyCourse();
        xwy.setIcourse(new EFCourse());
        xwy.studyXwyCourse();
    }
}