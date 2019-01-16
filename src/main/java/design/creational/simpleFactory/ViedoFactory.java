package design.creational.simpleFactory;

import com.sun.org.apache.regexp.internal.RE;

public class ViedoFactory {
//    public Video getVideo(String type){
//        if ("java".equals(type)){
//            return new JavaVideo();
//        }else if ("python".equals(type)){
//            return new PythonVideo();
//        }else {
//            return null;
//        }
//    }


    //使用反射
    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}