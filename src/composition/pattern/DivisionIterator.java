package composition.pattern;

import java.util.Iterator;

public class DivisionIterator implements Iterator {

    Corporate[] corporates = new Corporate[100];
    private int number= 0;

    public DivisionIterator(Corporate[] corporate) {
        this.corporates = corporate;
    }


    @Override
    public boolean hasNext() {
        if(number< corporates.length && corporates[number] != null){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return corporates[number++];
    }
}
