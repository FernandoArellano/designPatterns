package chainOfResponsabilities.pattern;

public class IntermidiateLayer implements HelpInterface {

    private static final int INTERMEDIATE_LAYER_HELP_CODE = 2 ;

    private HelpInterface succesor;

    public IntermidiateLayer(HelpInterface succesor){
        this.succesor = succesor;
    }

    public void getHelp(int helpCode){
        if(helpCode == INTERMEDIATE_LAYER_HELP_CODE){
            System.out.println("Intermediate Layer Helper");
        }
        else {
            succesor.getHelp(helpCode);
        }
    }

}
