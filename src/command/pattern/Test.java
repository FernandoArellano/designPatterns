package command.pattern;

public class Test {

    public static void main(String[] args){
        Invoker invoker = new Invoker();

        Receiver asiaServer = new AsiaServer();
        Receiver usServer = new USServer();

        Command shutdownAsiaServer = new ShutDownCommand(asiaServer);
        Command diagnoseUSServer = new DiagnosingCommand(usServer);

        invoker.setCommand(shutdownAsiaServer);
        invoker.run();

        invoker.setCommand(diagnoseUSServer);
        invoker.run();
    }
}
