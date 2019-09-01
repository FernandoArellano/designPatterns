package chainOfResponsabilities.pattern;

public class ApplicationHelp implements HelpInterface {

    @Override
    public void getHelp(int helpCode) {
        System.out.println("Application Help");
    }
}
