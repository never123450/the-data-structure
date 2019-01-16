package design.dependenceInVersion;

public class EFCourse implements Icourse {
    @Override
    public void studyCourse() {
        System.out.println("xwy在学习前端课程");
    }
}