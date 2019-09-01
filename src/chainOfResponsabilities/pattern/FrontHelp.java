package chainOfResponsabilities.pattern;

public class FrontHelp implements HelpInterface {

    public static final int FRONT_END_HELP_CODE = 1;

    private HelpInterface succesor;

    public FrontHelp(HelpInterface succesor){
        this.succesor = succesor;
    }

    public void getHelp(int helpCode){
        if(helpCode == FRONT_END_HELP_CODE){
            System.out.println("Front Helper");
        }
        else {
            succesor.getHelp(helpCode);
        }
    }
}
