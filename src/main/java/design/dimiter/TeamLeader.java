package design.dimiter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourse(){
        List<Coures> couresList = new ArrayList<>();
        for (int i=0;i<20;i++){
            couresList.add(new Coures());
        }
        System.out.println("在线课程的数量是："+couresList.size());
    }
}