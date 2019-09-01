package command.pattern;

public class DiagnosingCommand implements Command {

    Receiver receiver;

    public DiagnosingCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.diagnose();
        receiver.disconect();
    }
}
