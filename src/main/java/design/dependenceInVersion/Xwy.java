package design.dependenceInVersion;

public class Xwy {
    private Icourse icourse;



    //v1
//    public void studyFECourse() {
//        System.out.println("FE课程");
//    }
//
//    public void studyJavaCourse() {
//        System.out.println("java课程");
//    }


    //v2
//    public void studyXwyCourse(Icourse icourse){
//        icourse.studyCourse();
//    }

    

    //v3
//    public Xwy(Icourse icourse) {
//        this.icourse = icourse;
//    }
//
//    public void studyXwyCourse(){
//        icourse.studyCourse();
//    }

    //v4
    public void setIcourse(Icourse icourse) {
        this.icourse = icourse;
    }

    public Xwy() {
    }

    public void studyXwyCourse(){
        icourse.studyCourse();
    }
}