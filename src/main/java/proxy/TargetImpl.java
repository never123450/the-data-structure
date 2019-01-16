package proxy;

/**
 * Target的实现类
 * @author wpr
 *
 */
public class TargetImpl implements Target {
    @Override
    public void execute() {
        System.out.println("execute");
    }
}
