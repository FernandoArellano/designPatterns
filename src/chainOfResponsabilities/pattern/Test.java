package chainOfResponsabilities.pattern;

public class Test {

    public static void main(String [] args){
        final int FRONT_END_HELP = 1;
        final int INTERMEDIATE_LAYER_HELP = 2;
        final int GENERAL_HELP = 3;

        ApplicationHelp applicationHelp = new ApplicationHelp();
        IntermidiateLayer intermidiateLayer = new IntermidiateLayer(applicationHelp);
        FrontHelp frontHelp = new FrontHelp(intermidiateLayer);

        frontHelp.getHelp(GENERAL_HELP);
    }
}
