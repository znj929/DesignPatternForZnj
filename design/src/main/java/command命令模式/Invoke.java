package command命令模式;

/**
 * @Author: znj
 * @Date: 2021/5/23 0023 22:57
 */
public class Invoke {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(){
        command.execute();
    }
}
