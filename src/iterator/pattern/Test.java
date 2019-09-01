package iterator.pattern;

public class Test {

    public static void main(String [] args){
        Division division = new Division("Sales");
        IteratorVP iteratorVP;

        division.addVP("Fer");
        division.addVP("Fer2");
        division.addVP("Fer3");
        division.addVP("Fer4");

        iteratorVP = division.getIterator();

        while(iteratorVP.hasNext()){
            iteratorVP.next().print();
        }

    }
}
