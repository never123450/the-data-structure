package design.structure.flyweight;

public class Manager implements Employee {

    private String dapartment;
    private String reportContent;

    public Manager(String dapartment) {
        this.dapartment = dapartment;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}