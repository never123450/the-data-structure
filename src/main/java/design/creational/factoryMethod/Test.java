package design.creational.factoryMethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produde();

    }
}
