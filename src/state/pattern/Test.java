package state.pattern;

public class Test {

    public static void main(String[] args){
        Automat automat = new Automat(2);

        automat.gotApplication();
        automat.checkApplication();
        automat.rentAppartment();
    }
}
