package design.openClose;

public class Test {
    public static void main(String[] args) {
        ICourse javaCoures = new javaCoure(88,"语文",100d);
        System.out.println("课程id:"+javaCoures.getId()+"  课程名称："+javaCoures.getName()+"  课程价格:"+javaCoures.getPrice());
    }
}