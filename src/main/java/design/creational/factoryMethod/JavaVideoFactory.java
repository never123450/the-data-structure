package design.creational.factoryMethod;

public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}