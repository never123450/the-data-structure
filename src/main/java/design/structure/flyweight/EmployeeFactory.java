package design.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory  {
    private static final Map<String,Employee> employeMap = new HashMap<String,Employee>();

    public static Employee getManager(String department){
        Manager manager = (Manager) employeMap.get(department);
        if (manager == null){
            manager = new Manager(department);
            manager.setReportContent(department + "部门汇报：此次报告主要内容是。。。。");
            employeMap.put(department,manager);
            System.out.println("创建部门经理：" + department);
        }
        return manager;
    }
}