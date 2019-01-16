package design.creational.simpleFactory;

public class Test {
    public static void main(String[] args) {
        //v1
//        Video video = new JavaVideo();
//        video.produde();

        //v2
//        ViedoFactory viedoFactory = new ViedoFactory();
//        Video video = viedoFactory.getVideo("java");
//        if (video == null){
//            return;
//        }
//        video.produde();

        //使用反射
        ViedoFactory viedoFactory = new ViedoFactory();
        Video video = viedoFactory.getVideo(JavaVideo.class);
        if (video == null){
            return;
        }
        video.produde();

    }
}