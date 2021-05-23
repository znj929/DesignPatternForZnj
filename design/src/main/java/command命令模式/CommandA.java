package command命令模式;

/**
 * @Author: znj
 * @Date: 2021/5/23 0023 22:55
 */
public class CommandA implements Command{
    @Override
    public void execute() {
        System.out.println("执行 A 命令");
    }
}
