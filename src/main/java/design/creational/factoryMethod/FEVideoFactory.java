package design.creational.factoryMethod;

public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}