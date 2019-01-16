package design.behavior.templateMethod;

public class DesignPatternCourse extends ACOurse {
    @Override
    void packageCourse() {
        System.out.println("提供课程java源代码");
    }

    @Override
    protected boolean newwriteArticle() {
        return true;
    }
}