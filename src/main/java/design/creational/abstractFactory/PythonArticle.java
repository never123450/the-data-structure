package design.creational.abstractFactory;

public class PythonArticle extends  Article {
    @Override
    public void produce() {
        System.out.println("python 手记");
    }
}