package design.behavior.templateMethod;

public abstract class ACOurse {
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if (newwriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作ppt");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }


    final void writeArticle(){
        System.err.println("编写手记");
    }

    //钩子方法
    protected boolean newwriteArticle(){
        return false;
    }

    abstract void packageCourse();

}