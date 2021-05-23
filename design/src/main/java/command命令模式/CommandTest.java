package command命令模式;

/**
 * @Author: znj
 * @Date: 2021/5/23 0023 22:57
 */
public class CommandTest {
    public static void main(String[] args) {
        CommandA cA = new CommandA();
        CommandB cB = new CommandB();
        Invoke invoke = new Invoke();
        invoke.setCommand(cA);
        invoke.execute();
        invoke.setCommand(cB);
        invoke.execute();
    }
}
