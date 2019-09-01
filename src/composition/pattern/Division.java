package composition.pattern;

import java.util.Iterator;

public class Division extends Corporate {

    Corporate [] corporate = new Corporate[100];
    private String name;
    private int number= 0;

    public Division(String n){
        this.name = n;
    }

    public void addCorporate(Corporate c){
        corporate[number++] = c;
    }

    public void print(){
        Iterator iterator = iterator();
        while(iterator.hasNext()){
            Corporate c = (Corporate) iterator.next();
            c.print();
        }
    }

    public String getName(){
     return name;
    }

    public Iterator iterator(){
        return new DivisionIterator(corporate);
    }
}
