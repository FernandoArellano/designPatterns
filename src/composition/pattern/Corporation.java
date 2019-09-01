package composition.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Corporation extends Corporate {

    private List<Corporate> corporates = new ArrayList<>();

    public Corporation(){}

    public void addCorporate(Corporate corporate){
        corporates.add(corporate);
    }

    public void print(){
        Iterator iterator = corporates.iterator();
        while(iterator.hasNext()){
            Corporate c = (Corporate) iterator.next();
            c.print();
        }
    }

}
